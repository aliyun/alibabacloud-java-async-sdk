// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudSiemEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudSiemEventDetailResponseBody</p>
 */
public class DescribeCloudSiemEventDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeCloudSiemEventDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudSiemEventDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudSiemEventDetailResponseBody build() {
            return new DescribeCloudSiemEventDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlertNum")
        private Integer alertNum;

        @NameInMap("Aliuid")
        private Long aliuid;

        @NameInMap("AssetNum")
        private Integer assetNum;

        @NameInMap("AttCkLabels")
        private java.util.List < String > attCkLabels;

        @NameInMap("DataSources")
        private java.util.List < String > dataSources;

        @NameInMap("Description")
        private String description;

        @NameInMap("DescriptionEn")
        private String descriptionEn;

        @NameInMap("ExtContent")
        private String extContent;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("IncidentName")
        private String incidentName;

        @NameInMap("IncidentNameEn")
        private String incidentNameEn;

        @NameInMap("IncidentUuid")
        private String incidentUuid;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("ThreatLevel")
        private String threatLevel;

        @NameInMap("ThreatScore")
        private Float threatScore;

        private Data(Builder builder) {
            this.alertNum = builder.alertNum;
            this.aliuid = builder.aliuid;
            this.assetNum = builder.assetNum;
            this.attCkLabels = builder.attCkLabels;
            this.dataSources = builder.dataSources;
            this.description = builder.description;
            this.descriptionEn = builder.descriptionEn;
            this.extContent = builder.extContent;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.incidentName = builder.incidentName;
            this.incidentNameEn = builder.incidentNameEn;
            this.incidentUuid = builder.incidentUuid;
            this.remark = builder.remark;
            this.status = builder.status;
            this.threatLevel = builder.threatLevel;
            this.threatScore = builder.threatScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertNum
         */
        public Integer getAlertNum() {
            return this.alertNum;
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return assetNum
         */
        public Integer getAssetNum() {
            return this.assetNum;
        }

        /**
         * @return attCkLabels
         */
        public java.util.List < String > getAttCkLabels() {
            return this.attCkLabels;
        }

        /**
         * @return dataSources
         */
        public java.util.List < String > getDataSources() {
            return this.dataSources;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return descriptionEn
         */
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        /**
         * @return extContent
         */
        public String getExtContent() {
            return this.extContent;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return incidentName
         */
        public String getIncidentName() {
            return this.incidentName;
        }

        /**
         * @return incidentNameEn
         */
        public String getIncidentNameEn() {
            return this.incidentNameEn;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return threatLevel
         */
        public String getThreatLevel() {
            return this.threatLevel;
        }

        /**
         * @return threatScore
         */
        public Float getThreatScore() {
            return this.threatScore;
        }

        public static final class Builder {
            private Integer alertNum; 
            private Long aliuid; 
            private Integer assetNum; 
            private java.util.List < String > attCkLabels; 
            private java.util.List < String > dataSources; 
            private String description; 
            private String descriptionEn; 
            private String extContent; 
            private String gmtCreate; 
            private String gmtModified; 
            private String incidentName; 
            private String incidentNameEn; 
            private String incidentUuid; 
            private String remark; 
            private Integer status; 
            private String threatLevel; 
            private Float threatScore; 

            /**
             * AlertNum.
             */
            public Builder alertNum(Integer alertNum) {
                this.alertNum = alertNum;
                return this;
            }

            /**
             * Aliuid.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * AssetNum.
             */
            public Builder assetNum(Integer assetNum) {
                this.assetNum = assetNum;
                return this;
            }

            /**
             * AttCkLabels.
             */
            public Builder attCkLabels(java.util.List < String > attCkLabels) {
                this.attCkLabels = attCkLabels;
                return this;
            }

            /**
             * DataSources.
             */
            public Builder dataSources(java.util.List < String > dataSources) {
                this.dataSources = dataSources;
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
             * DescriptionEn.
             */
            public Builder descriptionEn(String descriptionEn) {
                this.descriptionEn = descriptionEn;
                return this;
            }

            /**
             * ExtContent.
             */
            public Builder extContent(String extContent) {
                this.extContent = extContent;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IncidentName.
             */
            public Builder incidentName(String incidentName) {
                this.incidentName = incidentName;
                return this;
            }

            /**
             * IncidentNameEn.
             */
            public Builder incidentNameEn(String incidentNameEn) {
                this.incidentNameEn = incidentNameEn;
                return this;
            }

            /**
             * IncidentUuid.
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * ThreatLevel.
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * ThreatScore.
             */
            public Builder threatScore(Float threatScore) {
                this.threatScore = threatScore;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
