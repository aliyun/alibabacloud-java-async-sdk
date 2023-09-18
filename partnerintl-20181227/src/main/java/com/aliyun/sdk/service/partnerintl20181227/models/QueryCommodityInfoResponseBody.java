// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCommodityInfoResponseBody</p>
 */
public class QueryCommodityInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ForceFatal")
    private Boolean forceFatal;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private QueryCommodityInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicMessage = builder.dynamicMessage;
        this.forceFatal = builder.forceFatal;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommodityInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return forceFatal
     */
    public Boolean getForceFatal() {
        return this.forceFatal;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String dynamicMessage; 
        private Boolean forceFatal; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ForceFatal.
         */
        public Builder forceFatal(Boolean forceFatal) {
            this.forceFatal = forceFatal;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCommodityInfoResponseBody build() {
            return new QueryCommodityInfoResponseBody(this);
        } 

    } 

    public static class ModuleList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("CommodityId")
        private Long commodityId;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Properties")
        private java.util.Map < String, String > properties;

        @NameInMap("SaleWay")
        private Integer saleWay;

        @NameInMap("SortIndex")
        private Integer sortIndex;

        @NameInMap("SpecId")
        private Long specId;

        private ModuleList(Builder builder) {
            this.code = builder.code;
            this.commodityId = builder.commodityId;
            this.description = builder.description;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.properties = builder.properties;
            this.saleWay = builder.saleWay;
            this.sortIndex = builder.sortIndex;
            this.specId = builder.specId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return commodityId
         */
        public Long getCommodityId() {
            return this.commodityId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return properties
         */
        public java.util.Map < String, String > getProperties() {
            return this.properties;
        }

        /**
         * @return saleWay
         */
        public Integer getSaleWay() {
            return this.saleWay;
        }

        /**
         * @return sortIndex
         */
        public Integer getSortIndex() {
            return this.sortIndex;
        }

        /**
         * @return specId
         */
        public Long getSpecId() {
            return this.specId;
        }

        public static final class Builder {
            private String code; 
            private Long commodityId; 
            private String description; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private String name; 
            private java.util.Map < String, String > properties; 
            private Integer saleWay; 
            private Integer sortIndex; 
            private Long specId; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CommodityId.
             */
            public Builder commodityId(Long commodityId) {
                this.commodityId = commodityId;
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
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map < String, String > properties) {
                this.properties = properties;
                return this;
            }

            /**
             * SaleWay.
             */
            public Builder saleWay(Integer saleWay) {
                this.saleWay = saleWay;
                return this;
            }

            /**
             * SortIndex.
             */
            public Builder sortIndex(Integer sortIndex) {
                this.sortIndex = sortIndex;
                return this;
            }

            /**
             * SpecId.
             */
            public Builder specId(Long specId) {
                this.specId = specId;
                return this;
            }

            public ModuleList build() {
                return new ModuleList(this);
            } 

        } 

    }
    public static class SpecList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("CommodityId")
        private Long commodityId;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModuleList")
        private java.util.List < ModuleList> moduleList;

        @NameInMap("Name")
        private String name;

        @NameInMap("Properties")
        private java.util.Map < String, String > properties;

        @NameInMap("SortIndex")
        private Integer sortIndex;

        private SpecList(Builder builder) {
            this.code = builder.code;
            this.commodityId = builder.commodityId;
            this.description = builder.description;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.moduleList = builder.moduleList;
            this.name = builder.name;
            this.properties = builder.properties;
            this.sortIndex = builder.sortIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return commodityId
         */
        public Long getCommodityId() {
            return this.commodityId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return moduleList
         */
        public java.util.List < ModuleList> getModuleList() {
            return this.moduleList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return properties
         */
        public java.util.Map < String, String > getProperties() {
            return this.properties;
        }

        /**
         * @return sortIndex
         */
        public Integer getSortIndex() {
            return this.sortIndex;
        }

        public static final class Builder {
            private String code; 
            private Long commodityId; 
            private String description; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private java.util.List < ModuleList> moduleList; 
            private String name; 
            private java.util.Map < String, String > properties; 
            private Integer sortIndex; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CommodityId.
             */
            public Builder commodityId(Long commodityId) {
                this.commodityId = commodityId;
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
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ModuleList.
             */
            public Builder moduleList(java.util.List < ModuleList> moduleList) {
                this.moduleList = moduleList;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map < String, String > properties) {
                this.properties = properties;
                return this;
            }

            /**
             * SortIndex.
             */
            public Builder sortIndex(Integer sortIndex) {
                this.sortIndex = sortIndex;
                return this;
            }

            public SpecList build() {
                return new SpecList(this);
            } 

        } 

    }
    public static class CommodityBaseInfo extends TeaModel {
        @NameInMap("AuditStatus")
        private Integer auditStatus;

        @NameInMap("Channel")
        private Integer channel;

        @NameInMap("Code")
        private String code;

        @NameInMap("GmtPublished")
        private String gmtPublished;

        @NameInMap("Name")
        private String name;

        @NameInMap("SaleMode")
        private Integer saleMode;

        @NameInMap("SaleWay")
        private Integer saleWay;

        @NameInMap("SpecList")
        private java.util.List < SpecList> specList;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SupplierPK")
        private String supplierPK;

        @NameInMap("Type")
        private Integer type;

        private CommodityBaseInfo(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.channel = builder.channel;
            this.code = builder.code;
            this.gmtPublished = builder.gmtPublished;
            this.name = builder.name;
            this.saleMode = builder.saleMode;
            this.saleWay = builder.saleWay;
            this.specList = builder.specList;
            this.status = builder.status;
            this.supplierPK = builder.supplierPK;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityBaseInfo create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return channel
         */
        public Integer getChannel() {
            return this.channel;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return gmtPublished
         */
        public String getGmtPublished() {
            return this.gmtPublished;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return saleMode
         */
        public Integer getSaleMode() {
            return this.saleMode;
        }

        /**
         * @return saleWay
         */
        public Integer getSaleWay() {
            return this.saleWay;
        }

        /**
         * @return specList
         */
        public java.util.List < SpecList> getSpecList() {
            return this.specList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return supplierPK
         */
        public String getSupplierPK() {
            return this.supplierPK;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer auditStatus; 
            private Integer channel; 
            private String code; 
            private String gmtPublished; 
            private String name; 
            private Integer saleMode; 
            private Integer saleWay; 
            private java.util.List < SpecList> specList; 
            private Integer status; 
            private String supplierPK; 
            private Integer type; 

            /**
             * AuditStatus.
             */
            public Builder auditStatus(Integer auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(Integer channel) {
                this.channel = channel;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * GmtPublished.
             */
            public Builder gmtPublished(String gmtPublished) {
                this.gmtPublished = gmtPublished;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SaleMode.
             */
            public Builder saleMode(Integer saleMode) {
                this.saleMode = saleMode;
                return this;
            }

            /**
             * SaleWay.
             */
            public Builder saleWay(Integer saleWay) {
                this.saleWay = saleWay;
                return this;
            }

            /**
             * SpecList.
             */
            public Builder specList(java.util.List < SpecList> specList) {
                this.specList = specList;
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
             * SupplierPK.
             */
            public Builder supplierPK(String supplierPK) {
                this.supplierPK = supplierPK;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public CommodityBaseInfo build() {
                return new CommodityBaseInfo(this);
            } 

        } 

    }
    public static class SupplierBaseInfo extends TeaModel {
        @NameInMap("Aliyun_id")
        private String aliyunId;

        @NameInMap("Aliyun_kp")
        private String aliyunKp;

        @NameInMap("City")
        private Integer city;

        @NameInMap("Company_name")
        private String companyName;

        @NameInMap("Created_on")
        private String createdOn;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Isv_key")
        private String isvKey;

        @NameInMap("Province")
        private Integer province;

        @NameInMap("SaleMode")
        private Integer saleMode;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private Integer type;

        private SupplierBaseInfo(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.aliyunKp = builder.aliyunKp;
            this.city = builder.city;
            this.companyName = builder.companyName;
            this.createdOn = builder.createdOn;
            this.id = builder.id;
            this.isvKey = builder.isvKey;
            this.province = builder.province;
            this.saleMode = builder.saleMode;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupplierBaseInfo create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return aliyunKp
         */
        public String getAliyunKp() {
            return this.aliyunKp;
        }

        /**
         * @return city
         */
        public Integer getCity() {
            return this.city;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return createdOn
         */
        public String getCreatedOn() {
            return this.createdOn;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isvKey
         */
        public String getIsvKey() {
            return this.isvKey;
        }

        /**
         * @return province
         */
        public Integer getProvince() {
            return this.province;
        }

        /**
         * @return saleMode
         */
        public Integer getSaleMode() {
            return this.saleMode;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliyunId; 
            private String aliyunKp; 
            private Integer city; 
            private String companyName; 
            private String createdOn; 
            private Long id; 
            private String isvKey; 
            private Integer province; 
            private Integer saleMode; 
            private Integer status; 
            private Integer type; 

            /**
             * Aliyun_id.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * Aliyun_kp.
             */
            public Builder aliyunKp(String aliyunKp) {
                this.aliyunKp = aliyunKp;
                return this;
            }

            /**
             * City.
             */
            public Builder city(Integer city) {
                this.city = city;
                return this;
            }

            /**
             * Company_name.
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * Created_on.
             */
            public Builder createdOn(String createdOn) {
                this.createdOn = createdOn;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Isv_key.
             */
            public Builder isvKey(String isvKey) {
                this.isvKey = isvKey;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(Integer province) {
                this.province = province;
                return this;
            }

            /**
             * SaleMode.
             */
            public Builder saleMode(Integer saleMode) {
                this.saleMode = saleMode;
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
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public SupplierBaseInfo build() {
                return new SupplierBaseInfo(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("CommodityBaseInfo")
        private CommodityBaseInfo commodityBaseInfo;

        @NameInMap("SupplierBaseInfo")
        private SupplierBaseInfo supplierBaseInfo;

        private Result(Builder builder) {
            this.commodityBaseInfo = builder.commodityBaseInfo;
            this.supplierBaseInfo = builder.supplierBaseInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return commodityBaseInfo
         */
        public CommodityBaseInfo getCommodityBaseInfo() {
            return this.commodityBaseInfo;
        }

        /**
         * @return supplierBaseInfo
         */
        public SupplierBaseInfo getSupplierBaseInfo() {
            return this.supplierBaseInfo;
        }

        public static final class Builder {
            private CommodityBaseInfo commodityBaseInfo; 
            private SupplierBaseInfo supplierBaseInfo; 

            /**
             * CommodityBaseInfo.
             */
            public Builder commodityBaseInfo(CommodityBaseInfo commodityBaseInfo) {
                this.commodityBaseInfo = commodityBaseInfo;
                return this;
            }

            /**
             * SupplierBaseInfo.
             */
            public Builder supplierBaseInfo(SupplierBaseInfo supplierBaseInfo) {
                this.supplierBaseInfo = supplierBaseInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
