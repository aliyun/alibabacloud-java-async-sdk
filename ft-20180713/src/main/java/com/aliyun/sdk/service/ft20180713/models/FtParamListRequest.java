// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtParamListRequest} extends {@link RequestModel}
 *
 * <p>FtParamListRequest</p>
 */
public class FtParamListRequest extends Request {
    @Query
    @NameInMap("Disk")
    private java.util.List < Disk> disk;

    @Query
    @NameInMap("Name")
    private String name;

    private FtParamListRequest(Builder builder) {
        super(builder);
        this.disk = builder.disk;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtParamListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disk
     */
    public java.util.List < Disk> getDisk() {
        return this.disk;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<FtParamListRequest, Builder> {
        private java.util.List < Disk> disk; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(FtParamListRequest request) {
            super(request);
            this.disk = request.disk;
            this.name = request.name;
        } 

        /**
         * Disk.
         */
        public Builder disk(java.util.List < Disk> disk) {
            this.putQueryParameter("Disk", disk);
            this.disk = disk;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public FtParamListRequest build() {
            return new FtParamListRequest(this);
        } 

    } 

    public static class Disk extends TeaModel {
        @NameInMap("Size")
        private java.util.List < String > size;

        @NameInMap("Type")
        private java.util.List < String > type;

        private Disk(Builder builder) {
            this.size = builder.size;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public java.util.List < String > getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public java.util.List < String > getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < String > size; 
            private java.util.List < String > type; 

            /**
             * Size.
             */
            public Builder size(java.util.List < String > size) {
                this.size = size;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(java.util.List < String > type) {
                this.type = type;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
}
