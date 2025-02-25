// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResponseBody</p>
 */
public class ListInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
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

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The status code.
         * <p>
         * 
         * - 200: The request was successful.
         * - Other codes: The request failed.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceResponseBody build() {
            return new ListInstanceResponseBody(this);
        } 

    } 

    public static class Spec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coverage")
        private String coverage;

        @com.aliyun.core.annotation.NameInMap("DiversionType")
        private String diversionType;

        @com.aliyun.core.annotation.NameInMap("Edition")
        private String edition;

        @com.aliyun.core.annotation.NameInMap("IdcNumbers")
        private String idcNumbers;

        @com.aliyun.core.annotation.NameInMap("InitialInstallation")
        private String initialInstallation;

        @com.aliyun.core.annotation.NameInMap("InitialQty")
        private String initialQty;

        @com.aliyun.core.annotation.NameInMap("IpSubnetNums")
        private String ipSubnetNums;

        @com.aliyun.core.annotation.NameInMap("MitigationAnalysis")
        private String mitigationAnalysis;

        @com.aliyun.core.annotation.NameInMap("MitigationAnalysisCapacity")
        private String mitigationAnalysisCapacity;

        @com.aliyun.core.annotation.NameInMap("MitigationCapacity")
        private String mitigationCapacity;

        @com.aliyun.core.annotation.NameInMap("MitigationNums")
        private String mitigationNums;

        @com.aliyun.core.annotation.NameInMap("NormalBandwidth")
        private String normalBandwidth;

        private Spec(Builder builder) {
            this.coverage = builder.coverage;
            this.diversionType = builder.diversionType;
            this.edition = builder.edition;
            this.idcNumbers = builder.idcNumbers;
            this.initialInstallation = builder.initialInstallation;
            this.initialQty = builder.initialQty;
            this.ipSubnetNums = builder.ipSubnetNums;
            this.mitigationAnalysis = builder.mitigationAnalysis;
            this.mitigationAnalysisCapacity = builder.mitigationAnalysisCapacity;
            this.mitigationCapacity = builder.mitigationCapacity;
            this.mitigationNums = builder.mitigationNums;
            this.normalBandwidth = builder.normalBandwidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return coverage
         */
        public String getCoverage() {
            return this.coverage;
        }

        /**
         * @return diversionType
         */
        public String getDiversionType() {
            return this.diversionType;
        }

        /**
         * @return edition
         */
        public String getEdition() {
            return this.edition;
        }

        /**
         * @return idcNumbers
         */
        public String getIdcNumbers() {
            return this.idcNumbers;
        }

        /**
         * @return initialInstallation
         */
        public String getInitialInstallation() {
            return this.initialInstallation;
        }

        /**
         * @return initialQty
         */
        public String getInitialQty() {
            return this.initialQty;
        }

        /**
         * @return ipSubnetNums
         */
        public String getIpSubnetNums() {
            return this.ipSubnetNums;
        }

        /**
         * @return mitigationAnalysis
         */
        public String getMitigationAnalysis() {
            return this.mitigationAnalysis;
        }

        /**
         * @return mitigationAnalysisCapacity
         */
        public String getMitigationAnalysisCapacity() {
            return this.mitigationAnalysisCapacity;
        }

        /**
         * @return mitigationCapacity
         */
        public String getMitigationCapacity() {
            return this.mitigationCapacity;
        }

        /**
         * @return mitigationNums
         */
        public String getMitigationNums() {
            return this.mitigationNums;
        }

        /**
         * @return normalBandwidth
         */
        public String getNormalBandwidth() {
            return this.normalBandwidth;
        }

        public static final class Builder {
            private String coverage; 
            private String diversionType; 
            private String edition; 
            private String idcNumbers; 
            private String initialInstallation; 
            private String initialQty; 
            private String ipSubnetNums; 
            private String mitigationAnalysis; 
            private String mitigationAnalysisCapacity; 
            private String mitigationCapacity; 
            private String mitigationNums; 
            private String normalBandwidth; 

            /**
             * The region of the asset.
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * The diversion mode. Valid values: on-demand always-on
             */
            public Builder diversionType(String diversionType) {
                this.diversionType = diversionType;
                return this;
            }

            /**
             * The mitigation plan.
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * The number of data centers. Valid values: 1 to 10.
             */
            public Builder idcNumbers(String idcNumbers) {
                this.idcNumbers = idcNumbers;
                return this;
            }

            /**
             * The initial installation mode.
             */
            public Builder initialInstallation(String initialInstallation) {
                this.initialInstallation = initialInstallation;
                return this;
            }

            /**
             * The initial installation quantity.
             */
            public Builder initialQty(String initialQty) {
                this.initialQty = initialQty;
                return this;
            }

            /**
             * The number of CIDR blocks. Value range: 1 to 10000.
             */
            public Builder ipSubnetNums(String ipSubnetNums) {
                this.ipSubnetNums = ipSubnetNums;
                return this;
            }

            /**
             * The mitigation analysis feature.
             */
            public Builder mitigationAnalysis(String mitigationAnalysis) {
                this.mitigationAnalysis = mitigationAnalysis;
                return this;
            }

            /**
             * The log storage capacity.
             */
            public Builder mitigationAnalysisCapacity(String mitigationAnalysisCapacity) {
                this.mitigationAnalysisCapacity = mitigationAnalysisCapacity;
                return this;
            }

            /**
             * The maximum mitigation capability.
             */
            public Builder mitigationCapacity(String mitigationCapacity) {
                this.mitigationCapacity = mitigationCapacity;
                return this;
            }

            /**
             * The number of mitigation sessions.
             */
            public Builder mitigationNums(String mitigationNums) {
                this.mitigationNums = mitigationNums;
                return this;
            }

            /**
             * The service traffic. Unit: Mbit/s.
             */
            public Builder normalBandwidth(String normalBandwidth) {
                this.normalBandwidth = normalBandwidth;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtExpire")
        private String gmtExpire;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SaleId")
        private String saleId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private Spec spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Instances(Builder builder) {
            this.comment = builder.comment;
            this.gmtCreate = builder.gmtCreate;
            this.gmtExpire = builder.gmtExpire;
            this.gmtModify = builder.gmtModify;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
            this.name = builder.name;
            this.saleId = builder.saleId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtExpire
         */
        public String getGmtExpire() {
            return this.gmtExpire;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return saleId
         */
        public String getSaleId() {
            return this.saleId;
        }

        /**
         * @return spec
         */
        public Spec getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String comment; 
            private String gmtCreate; 
            private String gmtExpire; 
            private String gmtModify; 
            private String instanceId; 
            private String message; 
            private String name; 
            private String saleId; 
            private Spec spec; 
            private String status; 
            private String userId; 

            /**
             * The description.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The purchase time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder gmtExpire(String gmtExpire) {
                this.gmtExpire = gmtExpire;
                return this;
            }

            /**
             * The update time.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * The alias of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The configurations of the instance.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
                return this;
            }

            /**
             * The specifications of the instance.
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * - normal
             * - expired
             * - deleting
             * - stopped
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List < Instances> instances;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Long num;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.instances = builder.instances;
            this.num = builder.num;
            this.page = builder.page;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instances
         */
        public java.util.List < Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Instances> instances; 
            private Long num; 
            private Long page; 
            private Long total; 

            /**
             * The details of the anti-DDoS diversion instance.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * The page number.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
