// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAIAgentEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIAgentEventResponseBody</p>
 */
public class ListAIAgentEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIAgentEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIAgentEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIAgentEventResponseBody model) {
            this.data = model.data;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of event information returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9FDE3D6F-26BD-5937-B0E5-8F47962B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIAgentEventResponseBody build() {
            return new ListAIAgentEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIAgentEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIAgentEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("CheckTime")
        private String checkTime;

        @com.aliyun.core.annotation.NameInMap("HandleTime")
        private String handleTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InfraInstanceId")
        private String infraInstanceId;

        @com.aliyun.core.annotation.NameInMap("InfraInternetIp")
        private String infraInternetIp;

        @com.aliyun.core.annotation.NameInMap("InfraIntranetIp")
        private String infraIntranetIp;

        @com.aliyun.core.annotation.NameInMap("InfraName")
        private String infraName;

        @com.aliyun.core.annotation.NameInMap("InfraRegionId")
        private String infraRegionId;

        @com.aliyun.core.annotation.NameInMap("InfraType")
        private String infraType;

        @com.aliyun.core.annotation.NameInMap("RiskDesc")
        private String riskDesc;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskName")
        private String riskName;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private Long skillId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.assetName = builder.assetName;
            this.assetType = builder.assetType;
            this.checkTime = builder.checkTime;
            this.handleTime = builder.handleTime;
            this.id = builder.id;
            this.infraInstanceId = builder.infraInstanceId;
            this.infraInternetIp = builder.infraInternetIp;
            this.infraIntranetIp = builder.infraIntranetIp;
            this.infraName = builder.infraName;
            this.infraRegionId = builder.infraRegionId;
            this.infraType = builder.infraType;
            this.riskDesc = builder.riskDesc;
            this.riskLevel = builder.riskLevel;
            this.riskName = builder.riskName;
            this.skillId = builder.skillId;
            this.source = builder.source;
            this.status = builder.status;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return checkTime
         */
        public String getCheckTime() {
            return this.checkTime;
        }

        /**
         * @return handleTime
         */
        public String getHandleTime() {
            return this.handleTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return infraInstanceId
         */
        public String getInfraInstanceId() {
            return this.infraInstanceId;
        }

        /**
         * @return infraInternetIp
         */
        public String getInfraInternetIp() {
            return this.infraInternetIp;
        }

        /**
         * @return infraIntranetIp
         */
        public String getInfraIntranetIp() {
            return this.infraIntranetIp;
        }

        /**
         * @return infraName
         */
        public String getInfraName() {
            return this.infraName;
        }

        /**
         * @return infraRegionId
         */
        public String getInfraRegionId() {
            return this.infraRegionId;
        }

        /**
         * @return infraType
         */
        public String getInfraType() {
            return this.infraType;
        }

        /**
         * @return riskDesc
         */
        public String getRiskDesc() {
            return this.riskDesc;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskName
         */
        public String getRiskName() {
            return this.riskName;
        }

        /**
         * @return skillId
         */
        public Long getSkillId() {
            return this.skillId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String assetName; 
            private String assetType; 
            private String checkTime; 
            private String handleTime; 
            private Long id; 
            private String infraInstanceId; 
            private String infraInternetIp; 
            private String infraIntranetIp; 
            private String infraName; 
            private String infraRegionId; 
            private String infraType; 
            private String riskDesc; 
            private String riskLevel; 
            private String riskName; 
            private Long skillId; 
            private String source; 
            private String status; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.assetName = model.assetName;
                this.assetType = model.assetType;
                this.checkTime = model.checkTime;
                this.handleTime = model.handleTime;
                this.id = model.id;
                this.infraInstanceId = model.infraInstanceId;
                this.infraInternetIp = model.infraInternetIp;
                this.infraIntranetIp = model.infraIntranetIp;
                this.infraName = model.infraName;
                this.infraRegionId = model.infraRegionId;
                this.infraType = model.infraType;
                this.riskDesc = model.riskDesc;
                this.riskLevel = model.riskLevel;
                this.riskName = model.riskName;
                this.skillId = model.skillId;
                this.source = model.source;
                this.status = model.status;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5zuzvcfe</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-chagee-bc-activity-elespin</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The asset name.</p>
             * 
             * <strong>example:</strong>
             * <p>25.2.2.83</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The type of the risky asset. Valid values:</p>
             * <ol>
             * <li>rag</li>
             * <li>internet</li>
             * <li>datasets</li>
             * <li>tool</li>
             * <li>model</li>
             * <li>skill</li>
             * <li>app</li>
             * <li>identity</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>tool</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The check time, in UNIX timestamp format. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1763949968</p>
             */
            public Builder checkTime(String checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * <p>The event handling time, in UNIX timestamp format. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1763949968</p>
             */
            public Builder handleTime(String handleTime) {
                this.handleTime = handleTime;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17616</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The infrastructure instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-test</p>
             */
            public Builder infraInstanceId(String infraInstanceId) {
                this.infraInstanceId = infraInstanceId;
                return this;
            }

            /**
             * <p>The public IP address of the infrastructure.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.3.4</p>
             */
            public Builder infraInternetIp(String infraInternetIp) {
                this.infraInternetIp = infraInternetIp;
                return this;
            }

            /**
             * <p>The private IP address of the infrastructure.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.3</p>
             */
            public Builder infraIntranetIp(String infraIntranetIp) {
                this.infraIntranetIp = infraIntranetIp;
                return this;
            }

            /**
             * <p>The infrastructure name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder infraName(String infraName) {
                this.infraName = infraName;
                return this;
            }

            /**
             * <p>The infrastructure region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder infraRegionId(String infraRegionId) {
                this.infraRegionId = infraRegionId;
                return this;
            }

            /**
             * <p>The infrastructure type.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder infraType(String infraType) {
                this.infraType = infraType;
                return this;
            }

            /**
             * <p>The risk description.</p>
             * 
             * <strong>example:</strong>
             * <p>The workflow does not have AI security guardrails enabled, which may lead to compliance violations, prompt injection and bypass, sensitive data leaks, and other risks</p>
             */
            public Builder riskDesc(String riskDesc) {
                this.riskDesc = riskDesc;
                return this;
            }

            /**
             * <p>The risk level of the detected alert. Valid values:</p>
             * <ul>
             * <li><strong>high</strong>: High.</li>
             * <li><strong>medium</strong>: Medium.</li>
             * <li><strong>low</strong>: Low.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The risk name.</p>
             * 
             * <strong>example:</strong>
             * <p>Weak password</p>
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * <p>The associated skill ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder skillId(Long skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>The event source. Valid values:</p>
             * <ol>
             * <li>cspm</li>
             * <li>aiguard</li>
             * <li>SASE</li>
             * <li>SAS </li>
             * <li>Agent-Runtime-Guard</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>SASE</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ol>
             * <li>unhandled: Pending.</li>
             * <li>handling: Being processed.</li>
             * <li>fixed: Fixed.</li>
             * <li>ignored: Ignored.</li>
             * <li>rescanned: Rescanned.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>unhandled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The cloud asset vendor. Valid values:</p>
             * <ul>
             * <li>** DIFY**: DIFY</li>
             * <li>** BAILIAN**: BAILIAN</li>
             * <li>** VOLCAI**: VOLCAI</li>
             * <li>** AGENTRUN**: AGENTRUN</li>
             * <li>** PAI**: PAI</li>
             * <li>** OpenClaw**: OpenClaw</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DIFY</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIAgentEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIAgentEventResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.nextToken = builder.nextToken;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private String nextToken; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.nextToken = model.nextToken;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The NextToken value returned when the NextToken-based pagination method is used.</p>
             * 
             * <strong>example:</strong>
             * <p>d6yVpGGP9cH8f9AWtqEXqOawJdolFvFeqJJSIPnYLoGc7/XPd5nbDfZcn1mJCj66Ep3Gbr55tl4NuBtNwsc0A0qvqC2Onfm9h2QmtG8HhaulnPkGmBnhntKqJmpRptTU</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records in the query result.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
