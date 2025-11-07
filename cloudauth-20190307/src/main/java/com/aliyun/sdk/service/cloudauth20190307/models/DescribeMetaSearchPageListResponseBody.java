// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeMetaSearchPageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetaSearchPageListResponseBody</p>
 */
public class DescribeMetaSearchPageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeMetaSearchPageListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetaSearchPageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeMetaSearchPageListResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeMetaSearchPageListResponseBody build() {
            return new DescribeMetaSearchPageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetaSearchPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetaSearchPageListResponseBody</p>
     */
    public static class Request extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VehicleNum")
        private String vehicleNum;

        @com.aliyun.core.annotation.NameInMap("VehicleType")
        private String vehicleType;

        @com.aliyun.core.annotation.NameInMap("VehicleTypeName")
        private String vehicleTypeName;

        private Request(Builder builder) {
            this.vehicleNum = builder.vehicleNum;
            this.vehicleType = builder.vehicleType;
            this.vehicleTypeName = builder.vehicleTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Request create() {
            return builder().build();
        }

        /**
         * @return vehicleNum
         */
        public String getVehicleNum() {
            return this.vehicleNum;
        }

        /**
         * @return vehicleType
         */
        public String getVehicleType() {
            return this.vehicleType;
        }

        /**
         * @return vehicleTypeName
         */
        public String getVehicleTypeName() {
            return this.vehicleTypeName;
        }

        public static final class Builder {
            private String vehicleNum; 
            private String vehicleType; 
            private String vehicleTypeName; 

            private Builder() {
            } 

            private Builder(Request model) {
                this.vehicleNum = model.vehicleNum;
                this.vehicleType = model.vehicleType;
                this.vehicleTypeName = model.vehicleTypeName;
            } 

            /**
             * VehicleNum.
             */
            public Builder vehicleNum(String vehicleNum) {
                this.vehicleNum = vehicleNum;
                return this;
            }

            /**
             * VehicleType.
             */
            public Builder vehicleType(String vehicleType) {
                this.vehicleType = vehicleType;
                return this;
            }

            /**
             * VehicleTypeName.
             */
            public Builder vehicleTypeName(String vehicleTypeName) {
                this.vehicleTypeName = vehicleTypeName;
                return this;
            }

            public Request build() {
                return new Request(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetaSearchPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetaSearchPageListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovedCount")
        private String approvedCount;

        @com.aliyun.core.annotation.NameInMap("ApprovedLoad")
        private String approvedLoad;

        @com.aliyun.core.annotation.NameInMap("AxleCount")
        private String axleCount;

        @com.aliyun.core.annotation.NameInMap("BackWheelDistance")
        private String backWheelDistance;

        @com.aliyun.core.annotation.NameInMap("BankCard")
        private String bankCard;

        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("Brand")
        private String brand;

        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("Displacement")
        private String displacement;

        @com.aliyun.core.annotation.NameInMap("EngineNum")
        private String engineNum;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("FrontWheelDistance")
        private String frontWheelDistance;

        @com.aliyun.core.annotation.NameInMap("FuelType")
        private String fuelType;

        @com.aliyun.core.annotation.NameInMap("InspectionDate")
        private String inspectionDate;

        @com.aliyun.core.annotation.NameInMap("ModelNum")
        private String modelNum;

        @com.aliyun.core.annotation.NameInMap("Power")
        private String power;

        @com.aliyun.core.annotation.NameInMap("RegistrationDate")
        private String registrationDate;

        @com.aliyun.core.annotation.NameInMap("ReleaseDate")
        private String releaseDate;

        @com.aliyun.core.annotation.NameInMap("RetirementDate")
        private String retirementDate;

        @com.aliyun.core.annotation.NameInMap("TotalMass")
        private String totalMass;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UnladenMass")
        private String unladenMass;

        @com.aliyun.core.annotation.NameInMap("UseProperty")
        private String useProperty;

        @com.aliyun.core.annotation.NameInMap("VehicleState")
        private String vehicleState;

        @com.aliyun.core.annotation.NameInMap("Vin")
        private String vin;

        @com.aliyun.core.annotation.NameInMap("WheelBase")
        private String wheelBase;

        private Data(Builder builder) {
            this.approvedCount = builder.approvedCount;
            this.approvedLoad = builder.approvedLoad;
            this.axleCount = builder.axleCount;
            this.backWheelDistance = builder.backWheelDistance;
            this.bankCard = builder.bankCard;
            this.bizCode = builder.bizCode;
            this.brand = builder.brand;
            this.color = builder.color;
            this.displacement = builder.displacement;
            this.engineNum = builder.engineNum;
            this.engineType = builder.engineType;
            this.frontWheelDistance = builder.frontWheelDistance;
            this.fuelType = builder.fuelType;
            this.inspectionDate = builder.inspectionDate;
            this.modelNum = builder.modelNum;
            this.power = builder.power;
            this.registrationDate = builder.registrationDate;
            this.releaseDate = builder.releaseDate;
            this.retirementDate = builder.retirementDate;
            this.totalMass = builder.totalMass;
            this.type = builder.type;
            this.unladenMass = builder.unladenMass;
            this.useProperty = builder.useProperty;
            this.vehicleState = builder.vehicleState;
            this.vin = builder.vin;
            this.wheelBase = builder.wheelBase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return approvedCount
         */
        public String getApprovedCount() {
            return this.approvedCount;
        }

        /**
         * @return approvedLoad
         */
        public String getApprovedLoad() {
            return this.approvedLoad;
        }

        /**
         * @return axleCount
         */
        public String getAxleCount() {
            return this.axleCount;
        }

        /**
         * @return backWheelDistance
         */
        public String getBackWheelDistance() {
            return this.backWheelDistance;
        }

        /**
         * @return bankCard
         */
        public String getBankCard() {
            return this.bankCard;
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return displacement
         */
        public String getDisplacement() {
            return this.displacement;
        }

        /**
         * @return engineNum
         */
        public String getEngineNum() {
            return this.engineNum;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return frontWheelDistance
         */
        public String getFrontWheelDistance() {
            return this.frontWheelDistance;
        }

        /**
         * @return fuelType
         */
        public String getFuelType() {
            return this.fuelType;
        }

        /**
         * @return inspectionDate
         */
        public String getInspectionDate() {
            return this.inspectionDate;
        }

        /**
         * @return modelNum
         */
        public String getModelNum() {
            return this.modelNum;
        }

        /**
         * @return power
         */
        public String getPower() {
            return this.power;
        }

        /**
         * @return registrationDate
         */
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        /**
         * @return retirementDate
         */
        public String getRetirementDate() {
            return this.retirementDate;
        }

        /**
         * @return totalMass
         */
        public String getTotalMass() {
            return this.totalMass;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unladenMass
         */
        public String getUnladenMass() {
            return this.unladenMass;
        }

        /**
         * @return useProperty
         */
        public String getUseProperty() {
            return this.useProperty;
        }

        /**
         * @return vehicleState
         */
        public String getVehicleState() {
            return this.vehicleState;
        }

        /**
         * @return vin
         */
        public String getVin() {
            return this.vin;
        }

        /**
         * @return wheelBase
         */
        public String getWheelBase() {
            return this.wheelBase;
        }

        public static final class Builder {
            private String approvedCount; 
            private String approvedLoad; 
            private String axleCount; 
            private String backWheelDistance; 
            private String bankCard; 
            private String bizCode; 
            private String brand; 
            private String color; 
            private String displacement; 
            private String engineNum; 
            private String engineType; 
            private String frontWheelDistance; 
            private String fuelType; 
            private String inspectionDate; 
            private String modelNum; 
            private String power; 
            private String registrationDate; 
            private String releaseDate; 
            private String retirementDate; 
            private String totalMass; 
            private String type; 
            private String unladenMass; 
            private String useProperty; 
            private String vehicleState; 
            private String vin; 
            private String wheelBase; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.approvedCount = model.approvedCount;
                this.approvedLoad = model.approvedLoad;
                this.axleCount = model.axleCount;
                this.backWheelDistance = model.backWheelDistance;
                this.bankCard = model.bankCard;
                this.bizCode = model.bizCode;
                this.brand = model.brand;
                this.color = model.color;
                this.displacement = model.displacement;
                this.engineNum = model.engineNum;
                this.engineType = model.engineType;
                this.frontWheelDistance = model.frontWheelDistance;
                this.fuelType = model.fuelType;
                this.inspectionDate = model.inspectionDate;
                this.modelNum = model.modelNum;
                this.power = model.power;
                this.registrationDate = model.registrationDate;
                this.releaseDate = model.releaseDate;
                this.retirementDate = model.retirementDate;
                this.totalMass = model.totalMass;
                this.type = model.type;
                this.unladenMass = model.unladenMass;
                this.useProperty = model.useProperty;
                this.vehicleState = model.vehicleState;
                this.vin = model.vin;
                this.wheelBase = model.wheelBase;
            } 

            /**
             * ApprovedCount.
             */
            public Builder approvedCount(String approvedCount) {
                this.approvedCount = approvedCount;
                return this;
            }

            /**
             * ApprovedLoad.
             */
            public Builder approvedLoad(String approvedLoad) {
                this.approvedLoad = approvedLoad;
                return this;
            }

            /**
             * AxleCount.
             */
            public Builder axleCount(String axleCount) {
                this.axleCount = axleCount;
                return this;
            }

            /**
             * BackWheelDistance.
             */
            public Builder backWheelDistance(String backWheelDistance) {
                this.backWheelDistance = backWheelDistance;
                return this;
            }

            /**
             * BankCard.
             */
            public Builder bankCard(String bankCard) {
                this.bankCard = bankCard;
                return this;
            }

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * Brand.
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Displacement.
             */
            public Builder displacement(String displacement) {
                this.displacement = displacement;
                return this;
            }

            /**
             * EngineNum.
             */
            public Builder engineNum(String engineNum) {
                this.engineNum = engineNum;
                return this;
            }

            /**
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * FrontWheelDistance.
             */
            public Builder frontWheelDistance(String frontWheelDistance) {
                this.frontWheelDistance = frontWheelDistance;
                return this;
            }

            /**
             * FuelType.
             */
            public Builder fuelType(String fuelType) {
                this.fuelType = fuelType;
                return this;
            }

            /**
             * InspectionDate.
             */
            public Builder inspectionDate(String inspectionDate) {
                this.inspectionDate = inspectionDate;
                return this;
            }

            /**
             * ModelNum.
             */
            public Builder modelNum(String modelNum) {
                this.modelNum = modelNum;
                return this;
            }

            /**
             * Power.
             */
            public Builder power(String power) {
                this.power = power;
                return this;
            }

            /**
             * RegistrationDate.
             */
            public Builder registrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
                return this;
            }

            /**
             * ReleaseDate.
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * RetirementDate.
             */
            public Builder retirementDate(String retirementDate) {
                this.retirementDate = retirementDate;
                return this;
            }

            /**
             * TotalMass.
             */
            public Builder totalMass(String totalMass) {
                this.totalMass = totalMass;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UnladenMass.
             */
            public Builder unladenMass(String unladenMass) {
                this.unladenMass = unladenMass;
                return this;
            }

            /**
             * UseProperty.
             */
            public Builder useProperty(String useProperty) {
                this.useProperty = useProperty;
                return this;
            }

            /**
             * VehicleState.
             */
            public Builder vehicleState(String vehicleState) {
                this.vehicleState = vehicleState;
                return this;
            }

            /**
             * Vin.
             */
            public Builder vin(String vin) {
                this.vin = vin;
                return this;
            }

            /**
             * WheelBase.
             */
            public Builder wheelBase(String wheelBase) {
                this.wheelBase = wheelBase;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetaSearchPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetaSearchPageListResponseBody</p>
     */
    public static class Response extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Response(Builder builder) {
            this.code = builder.code;
            this.data = builder.data;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Response create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
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

        public static final class Builder {
            private String code; 
            private Data data; 
            private String message; 

            private Builder() {
            } 

            private Builder(Response model) {
                this.code = model.code;
                this.data = model.data;
                this.message = model.message;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
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

            public Response build() {
                return new Response(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetaSearchPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetaSearchPageListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Api")
        private String api;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("BankCard")
        private String bankCard;

        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("IdentifyNum")
        private String identifyNum;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Request")
        private Request request;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RequestJson")
        private String requestJson;

        @com.aliyun.core.annotation.NameInMap("Response")
        private Response response;

        @com.aliyun.core.annotation.NameInMap("ResponseJson")
        private String responseJson;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("VehicleNum")
        private String vehicleNum;

        private Items(Builder builder) {
            this.api = builder.api;
            this.apiName = builder.apiName;
            this.bankCard = builder.bankCard;
            this.bizCode = builder.bizCode;
            this.date = builder.date;
            this.identifyNum = builder.identifyNum;
            this.ispName = builder.ispName;
            this.mobile = builder.mobile;
            this.request = builder.request;
            this.requestId = builder.requestId;
            this.requestJson = builder.requestJson;
            this.response = builder.response;
            this.responseJson = builder.responseJson;
            this.subCode = builder.subCode;
            this.userName = builder.userName;
            this.vehicleNum = builder.vehicleNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return api
         */
        public String getApi() {
            return this.api;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return bankCard
         */
        public String getBankCard() {
            return this.bankCard;
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return identifyNum
         */
        public String getIdentifyNum() {
            return this.identifyNum;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return request
         */
        public Request getRequest() {
            return this.request;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return requestJson
         */
        public String getRequestJson() {
            return this.requestJson;
        }

        /**
         * @return response
         */
        public Response getResponse() {
            return this.response;
        }

        /**
         * @return responseJson
         */
        public String getResponseJson() {
            return this.responseJson;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return vehicleNum
         */
        public String getVehicleNum() {
            return this.vehicleNum;
        }

        public static final class Builder {
            private String api; 
            private String apiName; 
            private String bankCard; 
            private String bizCode; 
            private String date; 
            private String identifyNum; 
            private String ispName; 
            private String mobile; 
            private Request request; 
            private String requestId; 
            private String requestJson; 
            private Response response; 
            private String responseJson; 
            private String subCode; 
            private String userName; 
            private String vehicleNum; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.api = model.api;
                this.apiName = model.apiName;
                this.bankCard = model.bankCard;
                this.bizCode = model.bizCode;
                this.date = model.date;
                this.identifyNum = model.identifyNum;
                this.ispName = model.ispName;
                this.mobile = model.mobile;
                this.request = model.request;
                this.requestId = model.requestId;
                this.requestJson = model.requestJson;
                this.response = model.response;
                this.responseJson = model.responseJson;
                this.subCode = model.subCode;
                this.userName = model.userName;
                this.vehicleNum = model.vehicleNum;
            } 

            /**
             * Api.
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * BankCard.
             */
            public Builder bankCard(String bankCard) {
                this.bankCard = bankCard;
                return this;
            }

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * IdentifyNum.
             */
            public Builder identifyNum(String identifyNum) {
                this.identifyNum = identifyNum;
                return this;
            }

            /**
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Request.
             */
            public Builder request(Request request) {
                this.request = request;
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
             * RequestJson.
             */
            public Builder requestJson(String requestJson) {
                this.requestJson = requestJson;
                return this;
            }

            /**
             * Response.
             */
            public Builder response(Response response) {
                this.response = response;
                return this;
            }

            /**
             * ResponseJson.
             */
            public Builder responseJson(String responseJson) {
                this.responseJson = responseJson;
                return this;
            }

            /**
             * SubCode.
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * VehicleNum.
             */
            public Builder vehicleNum(String vehicleNum) {
                this.vehicleNum = vehicleNum;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
