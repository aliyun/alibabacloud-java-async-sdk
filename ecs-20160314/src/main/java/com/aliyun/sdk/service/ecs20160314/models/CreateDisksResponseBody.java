// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDisksResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDisksResponseBody</p>
 */
public class CreateDisksResponseBody extends TeaModel {
    @NameInMap("DiskId")
    private DiskId diskId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDisksResponseBody(Builder builder) {
        this.diskId = builder.diskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return diskId
     */
    public DiskId getDiskId() {
        return this.diskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DiskId diskId; 
        private String requestId; 

        /**
         * DiskId.
         */
        public Builder diskId(DiskId diskId) {
            this.diskId = diskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDisksResponseBody build() {
            return new CreateDisksResponseBody(this);
        } 

    } 

    public static class DiskId extends TeaModel {
        @NameInMap("DiskIds")
        private java.util.List < String > diskIds;

        private DiskId(Builder builder) {
            this.diskIds = builder.diskIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskId create() {
            return builder().build();
        }

        /**
         * @return diskIds
         */
        public java.util.List < String > getDiskIds() {
            return this.diskIds;
        }

        public static final class Builder {
            private java.util.List < String > diskIds; 

            /**
             * DiskIds.
             */
            public Builder diskIds(java.util.List < String > diskIds) {
                this.diskIds = diskIds;
                return this;
            }

            public DiskId build() {
                return new DiskId(this);
            } 

        } 

    }
}
