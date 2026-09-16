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
         * <p>The paginated list data.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>5176EB42-6EE7-510B-9388-35018DF3175B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
    public static class ItemsRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VehicleNum")
        private String vehicleNum;

        @com.aliyun.core.annotation.NameInMap("VehicleType")
        private String vehicleType;

        @com.aliyun.core.annotation.NameInMap("VehicleTypeName")
        private String vehicleTypeName;

        private ItemsRequest(Builder builder) {
            this.vehicleNum = builder.vehicleNum;
            this.vehicleType = builder.vehicleType;
            this.vehicleTypeName = builder.vehicleTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemsRequest create() {
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

            private Builder(ItemsRequest model) {
                this.vehicleNum = model.vehicleNum;
                this.vehicleType = model.vehicleType;
                this.vehicleTypeName = model.vehicleTypeName;
            } 

            /**
             * <p>The vehicle number.</p>
             * 
             * <strong>example:</strong>
             * <p>浙J3H91H</p>
             */
            public Builder vehicleNum(String vehicleNum) {
                this.vehicleNum = vehicleNum;
                return this;
            }

            /**
             * <p>The vehicle type. Valid values:</p>
             * <ul>
             * <li><strong>01</strong>: large vehicle.  </li>
             * <li><strong>02</strong>: small vehicle.  </li>
             * <li><strong>03</strong>: embassy vehicle.  </li>
             * <li><strong>04</strong>: consulate vehicle.  </li>
             * <li><strong>05</strong>: overseas vehicle.  </li>
             * <li><strong>06</strong>: foreign vehicle.  </li>
             * <li><strong>07</strong>: standard motorcycle.  </li>
             * <li><strong>08</strong>: light motorcycle.  </li>
             * <li><strong>09</strong>: embassy motorcycle.  </li>
             * <li><strong>10</strong>: consulate motorcycle.  </li>
             * <li><strong>11</strong>: overseas motorcycle.  </li>
             * <li><strong>12</strong>: foreign motorcycle.  </li>
             * <li><strong>13</strong>: low-speed vehicle.  </li>
             * <li><strong>14</strong>: tractor.  </li>
             * <li><strong>15</strong>: trailer.  </li>
             * <li><strong>16</strong>: training vehicle.  </li>
             * <li><strong>17</strong>: training motorcycle.  </li>
             * <li><strong>20</strong>: temporary entry vehicle.  </li>
             * <li><strong>21</strong>: temporary entry motorcycle.  </li>
             * <li><strong>22</strong>: temporary driving vehicle.  </li>
             * <li><strong>23</strong>: police vehicle.  </li>
             * <li><strong>24</strong>: police motorcycle.  </li>
             * <li><strong>51</strong>: new energy large vehicle.  </li>
             * <li><strong>52</strong>: new energy small vehicle.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>52</p>
             */
            public Builder vehicleType(String vehicleType) {
                this.vehicleType = vehicleType;
                return this;
            }

            /**
             * <p>The vehicle type name.</p>
             * 
             * <strong>example:</strong>
             * <p>New energy small vehicle</p>
             */
            public Builder vehicleTypeName(String vehicleTypeName) {
                this.vehicleTypeName = vehicleTypeName;
                return this;
            }

            public ItemsRequest build() {
                return new ItemsRequest(this);
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
             * <p>The approved number of passengers.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder approvedCount(String approvedCount) {
                this.approvedCount = approvedCount;
                return this;
            }

            /**
             * <p>The approved passenger capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder approvedLoad(String approvedLoad) {
                this.approvedLoad = approvedLoad;
                return this;
            }

            /**
             * <p>The number of axles.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder axleCount(String axleCount) {
                this.axleCount = axleCount;
                return this;
            }

            /**
             * <p>The rear wheel track.</p>
             * 
             * <strong>example:</strong>
             * <p>1630</p>
             */
            public Builder backWheelDistance(String backWheelDistance) {
                this.backWheelDistance = backWheelDistance;
                return this;
            }

            /**
             * <p>The bank card number.</p>
             * 
             * <strong>example:</strong>
             * <p>622848001714440xxxx</p>
             */
            public Builder bankCard(String bankCard) {
                this.bankCard = bankCard;
                return this;
            }

            /**
             * <p>The authentication status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Authentication passed.</li>
             * <li><strong>2</strong>: Authentication failed.</li>
             * <li><strong>3</strong>: No record found.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>The brand name.</p>
             * 
             * <strong>example:</strong>
             * <p>Mercedes-Benz</p>
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * <p>The vehicle body color.</p>
             * 
             * <strong>example:</strong>
             * <p>White</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The displacement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder displacement(String displacement) {
                this.displacement = displacement;
                return this;
            }

            /**
             * <p>The engine number.</p>
             * 
             * <strong>example:</strong>
             * <p>N7YJ113PA</p>
             */
            public Builder engineNum(String engineNum) {
                this.engineNum = engineNum;
                return this;
            }

            /**
             * <p>The engine model.</p>
             * 
             * <strong>example:</strong>
             * <p>CA6GV30TD</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * <p>The front wheel track.</p>
             * 
             * <strong>example:</strong>
             * <p>1630</p>
             */
            public Builder frontWheelDistance(String frontWheelDistance) {
                this.frontWheelDistance = frontWheelDistance;
                return this;
            }

            /**
             * <p>The fuel type.</p>
             * 
             * <strong>example:</strong>
             * <p>Electric</p>
             */
            public Builder fuelType(String fuelType) {
                this.fuelType = fuelType;
                return this;
            }

            /**
             * <p>The inspection validity expiration date. Format: YYYY-MM-DD HH:mm:ss, for example, 2026-07-31 00:00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-31 00:00:00</p>
             */
            public Builder inspectionDate(String inspectionDate) {
                this.inspectionDate = inspectionDate;
                return this;
            }

            /**
             * <p>The vehicle model number.</p>
             * 
             * <strong>example:</strong>
             * <p>HQ7002BEV67</p>
             */
            public Builder modelNum(String modelNum) {
                this.modelNum = modelNum;
                return this;
            }

            /**
             * <p>The power.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder power(String power) {
                this.power = power;
                return this;
            }

            /**
             * <p>The initial registration date. Format: YYYY-MM-DD HH:mm:ss, for example, 2015-08-24 00:00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-08-24 00:00:00</p>
             */
            public Builder registrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
                return this;
            }

            /**
             * <p>The manufacturing date. Format: YYYY-MM-DD HH:mm:ss, for example, 2022-08-13 00:00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-13 00:00:00</p>
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * <p>The mandatory retirement date. Format: YYYY-MM-DD HH:mm:ss, for example, 2099-12-31 00:00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2099-12-31 00:00:00</p>
             */
            public Builder retirementDate(String retirementDate) {
                this.retirementDate = retirementDate;
                return this;
            }

            /**
             * <p>The total mass.</p>
             * 
             * <strong>example:</strong>
             * <p>2350</p>
             */
            public Builder totalMass(String totalMass) {
                this.totalMass = totalMass;
                return this;
            }

            /**
             * <p>The vehicle type.</p>
             * 
             * <strong>example:</strong>
             * <p>Small sedan</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The curb weight.</p>
             * 
             * <strong>example:</strong>
             * <p>1900</p>
             */
            public Builder unladenMass(String unladenMass) {
                this.unladenMass = unladenMass;
                return this;
            }

            /**
             * <p>The usage property.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder useProperty(String useProperty) {
                this.useProperty = useProperty;
                return this;
            }

            /**
             * <p>The motor vehicle status.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder vehicleState(String vehicleState) {
                this.vehicleState = vehicleState;
                return this;
            }

            /**
             * <p>The vehicle identification number (VIN).</p>
             * 
             * <strong>example:</strong>
             * <p>LDC643T44G3667219</p>
             */
            public Builder vin(String vin) {
                this.vin = vin;
                return this;
            }

            /**
             * <p>The wheelbase.</p>
             * 
             * <strong>example:</strong>
             * <p>2750</p>
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
    public static class ItemsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private ItemsResponse(Builder builder) {
            this.code = builder.code;
            this.data = builder.data;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemsResponse create() {
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

            private Builder(ItemsResponse model) {
                this.code = model.code;
                this.data = model.data;
                this.message = model.message;
            } 

            /**
             * <p>The HTTP return code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The response data.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ItemsResponse build() {
                return new ItemsResponse(this);
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
        private ItemsRequest request;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RequestJson")
        private String requestJson;

        @com.aliyun.core.annotation.NameInMap("Response")
        private ItemsResponse response;

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
        public ItemsRequest getRequest() {
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
        public ItemsResponse getResponse() {
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
            private ItemsRequest request; 
            private String requestId; 
            private String requestJson; 
            private ItemsResponse response; 
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
             * <p>The product API. Valid values:</p>
             * <ul>
             * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification.</li>
             * <li><strong>ID_PERIOD</strong>: ID card validity period verification.</li>
             * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration.</li>
             * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status.</li>
             * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition).</li>
             * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition).</li>
             * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification.</li>
             * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition).</li>
             * <li><strong>MOBILE_DETECT</strong>: phone number detection. </li>
             * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition).</li>
             * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition.</li>
             * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition.</li>
             * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query.</li>
             * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ID_CARD_2_META</p>
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * <p>The name corresponding to the API. Valid values:</p>
             * <ul>
             * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification.</li>
             * <li><strong>ID_PERIOD</strong>: ID card validity period verification.</li>
             * <li><strong>MOBILE_ONLINE_LENGTH</strong>: Mobile number online duration.</li>
             * <li><strong>MOBILE_ONLINE_STATUS</strong>: Mobile number online status.</li>
             * <li><strong>MOBILE_3_META_SIMPLE</strong>: Mobile number three-element verification (simple edition).</li>
             * <li><strong>MOBILE_3_META</strong>: Mobile number three-element verification (detailed edition).</li>
             * <li><strong>MOBILE_2_META</strong>: Mobile number two-element verification.</li>
             * <li><strong>BANK_CARD_N_META</strong>: Bank card verification (detailed edition).</li>
             * <li><strong>MOBILE_DETECT</strong>: Number detection. </li>
             * <li><strong>VEHICLE_N_META</strong>: Vehicle element verification (enhanced edition).</li>
             * <li><strong>VEHICLE_PENTA_INFO</strong>: Vehicle five-element information recognition.</li>
             * <li><strong>VEHICLE_LICENSE_INFO</strong>: Vehicle information recognition.</li>
             * <li><strong>VEHICLE_INSURE_DATE</strong>: Vehicle insurance date query.</li>
             * <li><strong>VEHICLE_CHECK</strong>: Vehicle element verification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ID card two-element verification</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The bank card ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6214837145546986</p>
             */
            public Builder bankCard(String bankCard) {
                this.bankCard = bankCard;
                return this;
            }

            /**
             * <p>The authentication status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Authentication passed.</li>
             * <li><strong>2</strong>: Authentication failed.</li>
             * <li><strong>3</strong>: No record found.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>The authentication date. Format: YYYY-MM-DD HH:mm:ss, for example, 2025-10-17 10:00:11.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-17 10:00:11</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The ID card number.</p>
             * 
             * <strong>example:</strong>
             * <p>4****************X</p>
             */
            public Builder identifyNum(String identifyNum) {
                this.identifyNum = identifyNum;
                return this;
            }

            /**
             * <p>The telecommunications service provider name. Valid values:</p>
             * <ul>
             * <li><strong>CMCC</strong>: China Mobile.</li>
             * <li><strong>CUCC</strong>: China Unicom.</li>
             * <li><strong>CTCC</strong>: China Telecom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUCC</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>The mobile phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1500000xxxx</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The request parameters.</p>
             */
            public Builder request(ItemsRequest request) {
                this.request = request;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>B0102BEF-4411-57C3-860D-CFE7DE0A64C0</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The HTTP request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;productCode\&quot;:\&quot;cloudauth_infoverify_public_cn\&quot;,\&quot;identifyNum\&quot;:\&quot;4****************X\&quot;,\&quot;userName\&quot;:\&quot;**豪\&quot;,\&quot;userId\&quot;:\&quot;12600512516xxxxx\&quot;}</p>
             */
            public Builder requestJson(String requestJson) {
                this.requestJson = requestJson;
                return this;
            }

            /**
             * <p>The response content.</p>
             */
            public Builder response(ItemsResponse response) {
                this.response = response;
                return this;
            }

            /**
             * <p>The response content.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;code\&quot;:\&quot;200\&quot;,\&quot;data\&quot;:{\&quot;bizCode\&quot;:\&quot;1\&quot;,\&quot;ispName\&quot;:\&quot;CMCC\&quot;,\&quot;subCode\&quot;:\&quot;101\&quot;},\&quot;message\&quot;:\&quot;Call successful\&quot;}</p>
             */
            public Builder responseJson(String responseJson) {
                this.responseJson = responseJson;
                return this;
            }

            /**
             * <p>The result code. For more information, refer to the <a href="https://www.alibabacloud.com/help/en/id-verification/information-verification/">official documentation</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>207</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>**豪</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The vehicle number.</p>
             * 
             * <strong>example:</strong>
             * <p>浙J3H91H</p>
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
