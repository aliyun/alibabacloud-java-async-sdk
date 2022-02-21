// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGeoFenceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListGeoFenceDetailResponseBody</p>
 */
public class ListGeoFenceDetailResponseBody extends TeaModel {
    @NameInMap("FenceList")
    private java.util.List < FenceList> fenceList;

    @NameInMap("RequestId")
    private String requestId;

    private ListGeoFenceDetailResponseBody(Builder builder) {
        this.fenceList = builder.fenceList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGeoFenceDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return fenceList
     */
    public java.util.List < FenceList> getFenceList() {
        return this.fenceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FenceList> fenceList; 
        private String requestId; 

        /**
         * FenceList.
         */
        public Builder fenceList(java.util.List < FenceList> fenceList) {
            this.fenceList = fenceList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGeoFenceDetailResponseBody build() {
            return new ListGeoFenceDetailResponseBody(this);
        } 

    } 

    public static class FenceList extends TeaModel {
        @NameInMap("AlarmCondition")
        private String alarmCondition;

        @NameInMap("Area")
        private Float area;

        @NameInMap("CityCode")
        private String cityCode;

        @NameInMap("CountryCode")
        private String countryCode;

        @NameInMap("Ctime")
        private Long ctime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Description")
        private String description;

        @NameInMap("FenceId")
        private Long fenceId;

        @NameInMap("FenceName")
        private String fenceName;

        @NameInMap("Mtime")
        private Long mtime;

        @NameInMap("Points")
        private String points;

        @NameInMap("ProvinceCode")
        private String provinceCode;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("Valid")
        private Boolean valid;

        private FenceList(Builder builder) {
            this.alarmCondition = builder.alarmCondition;
            this.area = builder.area;
            this.cityCode = builder.cityCode;
            this.countryCode = builder.countryCode;
            this.ctime = builder.ctime;
            this.deleted = builder.deleted;
            this.description = builder.description;
            this.fenceId = builder.fenceId;
            this.fenceName = builder.fenceName;
            this.mtime = builder.mtime;
            this.points = builder.points;
            this.provinceCode = builder.provinceCode;
            this.type = builder.type;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FenceList create() {
            return builder().build();
        }

        /**
         * @return alarmCondition
         */
        public String getAlarmCondition() {
            return this.alarmCondition;
        }

        /**
         * @return area
         */
        public Float getArea() {
            return this.area;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return ctime
         */
        public Long getCtime() {
            return this.ctime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fenceId
         */
        public Long getFenceId() {
            return this.fenceId;
        }

        /**
         * @return fenceName
         */
        public String getFenceName() {
            return this.fenceName;
        }

        /**
         * @return mtime
         */
        public Long getMtime() {
            return this.mtime;
        }

        /**
         * @return points
         */
        public String getPoints() {
            return this.points;
        }

        /**
         * @return provinceCode
         */
        public String getProvinceCode() {
            return this.provinceCode;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        public static final class Builder {
            private String alarmCondition; 
            private Float area; 
            private String cityCode; 
            private String countryCode; 
            private Long ctime; 
            private Boolean deleted; 
            private String description; 
            private Long fenceId; 
            private String fenceName; 
            private Long mtime; 
            private String points; 
            private String provinceCode; 
            private Integer type; 
            private Boolean valid; 

            /**
             * AlarmCondition.
             */
            public Builder alarmCondition(String alarmCondition) {
                this.alarmCondition = alarmCondition;
                return this;
            }

            /**
             * Area.
             */
            public Builder area(Float area) {
                this.area = area;
                return this;
            }

            /**
             * CityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * CountryCode.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * Ctime.
             */
            public Builder ctime(Long ctime) {
                this.ctime = ctime;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
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
             * FenceId.
             */
            public Builder fenceId(Long fenceId) {
                this.fenceId = fenceId;
                return this;
            }

            /**
             * FenceName.
             */
            public Builder fenceName(String fenceName) {
                this.fenceName = fenceName;
                return this;
            }

            /**
             * Mtime.
             */
            public Builder mtime(Long mtime) {
                this.mtime = mtime;
                return this;
            }

            /**
             * Points.
             */
            public Builder points(String points) {
                this.points = points;
                return this;
            }

            /**
             * ProvinceCode.
             */
            public Builder provinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Valid.
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            public FenceList build() {
                return new FenceList(this);
            } 

        } 

    }
}
