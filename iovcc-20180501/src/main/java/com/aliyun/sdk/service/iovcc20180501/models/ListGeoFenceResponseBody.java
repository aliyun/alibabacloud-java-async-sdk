// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGeoFenceResponseBody} extends {@link TeaModel}
 *
 * <p>ListGeoFenceResponseBody</p>
 */
public class ListGeoFenceResponseBody extends TeaModel {
    @NameInMap("FenceList")
    private java.util.List < FenceList> fenceList;

    @NameInMap("RequestId")
    private String requestId;

    private ListGeoFenceResponseBody(Builder builder) {
        this.fenceList = builder.fenceList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGeoFenceResponseBody create() {
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

        public ListGeoFenceResponseBody build() {
            return new ListGeoFenceResponseBody(this);
        } 

    } 

    public static class FenceList extends TeaModel {
        @NameInMap("CityCode")
        private String cityCode;

        @NameInMap("CountryCode")
        private String countryCode;

        @NameInMap("Ctime")
        private Long ctime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("FenceId")
        private Long fenceId;

        @NameInMap("FenceName")
        private String fenceName;

        @NameInMap("Mtime")
        private Long mtime;

        @NameInMap("ProvinceCode")
        private String provinceCode;

        @NameInMap("Valid")
        private Boolean valid;

        private FenceList(Builder builder) {
            this.cityCode = builder.cityCode;
            this.countryCode = builder.countryCode;
            this.ctime = builder.ctime;
            this.deleted = builder.deleted;
            this.fenceId = builder.fenceId;
            this.fenceName = builder.fenceName;
            this.mtime = builder.mtime;
            this.provinceCode = builder.provinceCode;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FenceList create() {
            return builder().build();
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
         * @return provinceCode
         */
        public String getProvinceCode() {
            return this.provinceCode;
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        public static final class Builder {
            private String cityCode; 
            private String countryCode; 
            private Long ctime; 
            private Boolean deleted; 
            private Long fenceId; 
            private String fenceName; 
            private Long mtime; 
            private String provinceCode; 
            private Boolean valid; 

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
             * ProvinceCode.
             */
            public Builder provinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
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
