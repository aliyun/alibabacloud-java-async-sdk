// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListComponentVersionsRequest</p>
 */
public class ListComponentVersionsRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Query
    @NameInMap("pageNum")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("platforms")
    private java.util.List < Platforms> platforms;

    @Query
    @NameInMap("version")
    private String version;

    private ListComponentVersionsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.platforms = builder.platforms;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return platforms
     */
    public java.util.List < Platforms> getPlatforms() {
        return this.platforms;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ListComponentVersionsRequest, Builder> {
        private String uid; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List < Platforms> platforms; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListComponentVersionsRequest request) {
            super(request);
            this.uid = request.uid;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.platforms = request.platforms;
            this.version = request.version;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * platforms.
         */
        public Builder platforms(java.util.List < Platforms> platforms) {
            String platformsShrink = shrink(platforms, "platforms", "json");
            this.putQueryParameter("platforms", platformsShrink);
            this.platforms = platforms;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public ListComponentVersionsRequest build() {
            return new ListComponentVersionsRequest(this);
        } 

    } 

    public static class Platforms extends TeaModel {
        @NameInMap("architecture")
        private String architecture;

        @NameInMap("os")
        private String os;

        private Platforms(Builder builder) {
            this.architecture = builder.architecture;
            this.os = builder.os;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platforms create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        public static final class Builder {
            private String architecture; 
            private String os; 

            /**
             * architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            public Platforms build() {
                return new Platforms(this);
            } 

        } 

    }
}
