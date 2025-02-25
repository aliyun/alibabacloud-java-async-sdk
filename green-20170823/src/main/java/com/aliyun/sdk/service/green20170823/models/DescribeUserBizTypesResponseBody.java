// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBizTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBizTypesResponseBody</p>
 */
public class DescribeUserBizTypesResponseBody extends TeaModel {
    @NameInMap("BizTypeList")
    private java.util.List < BizTypeList> bizTypeList;

    @NameInMap("BizTypeListImport")
    private java.util.List < BizTypeListImport> bizTypeListImport;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUserBizTypesResponseBody(Builder builder) {
        this.bizTypeList = builder.bizTypeList;
        this.bizTypeListImport = builder.bizTypeListImport;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBizTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizTypeList
     */
    public java.util.List < BizTypeList> getBizTypeList() {
        return this.bizTypeList;
    }

    /**
     * @return bizTypeListImport
     */
    public java.util.List < BizTypeListImport> getBizTypeListImport() {
        return this.bizTypeListImport;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BizTypeList> bizTypeList; 
        private java.util.List < BizTypeListImport> bizTypeListImport; 
        private String requestId; 

        /**
         * BizTypeList.
         */
        public Builder bizTypeList(java.util.List < BizTypeList> bizTypeList) {
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * BizTypeListImport.
         */
        public Builder bizTypeListImport(java.util.List < BizTypeListImport> bizTypeListImport) {
            this.bizTypeListImport = bizTypeListImport;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserBizTypesResponseBody build() {
            return new DescribeUserBizTypesResponseBody(this);
        } 

    } 

    public static class BizTypeList extends TeaModel {
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("CiteTemplate")
        private Boolean citeTemplate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Gray")
        private Boolean gray;

        @NameInMap("IndustryInfo")
        private String industryInfo;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceBizType")
        private String sourceBizType;

        private BizTypeList(Builder builder) {
            this.bizType = builder.bizType;
            this.citeTemplate = builder.citeTemplate;
            this.description = builder.description;
            this.gray = builder.gray;
            this.industryInfo = builder.industryInfo;
            this.source = builder.source;
            this.sourceBizType = builder.sourceBizType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizTypeList create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return citeTemplate
         */
        public Boolean getCiteTemplate() {
            return this.citeTemplate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gray
         */
        public Boolean getGray() {
            return this.gray;
        }

        /**
         * @return industryInfo
         */
        public String getIndustryInfo() {
            return this.industryInfo;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceBizType
         */
        public String getSourceBizType() {
            return this.sourceBizType;
        }

        public static final class Builder {
            private String bizType; 
            private Boolean citeTemplate; 
            private String description; 
            private Boolean gray; 
            private String industryInfo; 
            private String source; 
            private String sourceBizType; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * CiteTemplate.
             */
            public Builder citeTemplate(Boolean citeTemplate) {
                this.citeTemplate = citeTemplate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Gray.
             */
            public Builder gray(Boolean gray) {
                this.gray = gray;
                return this;
            }

            /**
             * IndustryInfo.
             */
            public Builder industryInfo(String industryInfo) {
                this.industryInfo = industryInfo;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceBizType.
             */
            public Builder sourceBizType(String sourceBizType) {
                this.sourceBizType = sourceBizType;
                return this;
            }

            public BizTypeList build() {
                return new BizTypeList(this);
            } 

        } 

    }
    public static class BizTypeListImport extends TeaModel {
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("CiteTemplate")
        private Boolean citeTemplate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Gray")
        private Boolean gray;

        @NameInMap("IndustryInfo")
        private String industryInfo;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceBizType")
        private String sourceBizType;

        private BizTypeListImport(Builder builder) {
            this.bizType = builder.bizType;
            this.citeTemplate = builder.citeTemplate;
            this.description = builder.description;
            this.gray = builder.gray;
            this.industryInfo = builder.industryInfo;
            this.source = builder.source;
            this.sourceBizType = builder.sourceBizType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizTypeListImport create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return citeTemplate
         */
        public Boolean getCiteTemplate() {
            return this.citeTemplate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gray
         */
        public Boolean getGray() {
            return this.gray;
        }

        /**
         * @return industryInfo
         */
        public String getIndustryInfo() {
            return this.industryInfo;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceBizType
         */
        public String getSourceBizType() {
            return this.sourceBizType;
        }

        public static final class Builder {
            private String bizType; 
            private Boolean citeTemplate; 
            private String description; 
            private Boolean gray; 
            private String industryInfo; 
            private String source; 
            private String sourceBizType; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * CiteTemplate.
             */
            public Builder citeTemplate(Boolean citeTemplate) {
                this.citeTemplate = citeTemplate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Gray.
             */
            public Builder gray(Boolean gray) {
                this.gray = gray;
                return this;
            }

            /**
             * IndustryInfo.
             */
            public Builder industryInfo(String industryInfo) {
                this.industryInfo = industryInfo;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceBizType.
             */
            public Builder sourceBizType(String sourceBizType) {
                this.sourceBizType = sourceBizType;
                return this;
            }

            public BizTypeListImport build() {
                return new BizTypeListImport(this);
            } 

        } 

    }
}
