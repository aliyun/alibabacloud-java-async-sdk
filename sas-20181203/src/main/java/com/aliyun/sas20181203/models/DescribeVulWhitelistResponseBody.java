// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeVulWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulWhitelistResponseBody</p>
 */
public class DescribeVulWhitelistResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VulWhitelists")
    private java.util.List < VulWhitelists> vulWhitelists;


    private DescribeVulWhitelistResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vulWhitelists = builder.vulWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vulWhitelists
     */
    public java.util.List < VulWhitelists> getVulWhitelists() {
        return this.vulWhitelists;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VulWhitelists> vulWhitelists; 

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>VulWhitelists.</p>
         */
        public Builder vulWhitelists(java.util.List < VulWhitelists> vulWhitelists) {
            this.vulWhitelists = vulWhitelists;
            return this;
        }

        public DescribeVulWhitelistResponseBody build() {
            return new DescribeVulWhitelistResponseBody(this);
        } 

    } 

    public static class VulWhitelists extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("TargetInfo")
        private String targetInfo;

        @NameInMap("Type")
        private String type;


        private VulWhitelists(Builder builder) {
            this.aliasName = builder.aliasName;
            this.id = builder.id;
            this.name = builder.name;
            this.reason = builder.reason;
            this.targetInfo = builder.targetInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulWhitelists create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return targetInfo
         */
        public String getTargetInfo() {
            return this.targetInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasName; 
            private String id; 
            private String name; 
            private String reason; 
            private String targetInfo; 
            private String type; 

            /**
             * <p>AliasName.</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>Id.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Reason.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>TargetInfo.</p>
             */
            public Builder targetInfo(String targetInfo) {
                this.targetInfo = targetInfo;
                return this;
            }

            /**
             * <p>Type.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VulWhitelists build() {
                return new VulWhitelists(this);
            } 

        } 

    }
}
