// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudVendorRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudVendorRegionsResponseBody</p>
 */
public class ListCloudVendorRegionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListCloudVendorRegionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudVendorRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Integer count; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The return code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The regions that the service provider supports.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message returned.
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

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCloudVendorRegionsResponseBody build() {
            return new ListCloudVendorRegionsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("Disable")
        private Integer disable;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Selected")
        private Integer selected;

        private Data(Builder builder) {
            this.area = builder.area;
            this.disable = builder.disable;
            this.regionId = builder.regionId;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return disable
         */
        public Integer getDisable() {
            return this.disable;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return selected
         */
        public Integer getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String area; 
            private Integer disable; 
            private String regionId; 
            private Integer selected; 

            /**
             * The area to which the region belongs. The valid values vary based on the value of the Vendor parameter.
             * <p>
             * 
             * *   Valid values if **Vendor** is set to Tencent:
             * *   **cn**: China
             * *   **southeast_asia**: Southeast Asia Pacific
             * *   **northeast_asia**: Northeast Asia Pacific
             * *   **southern_asia**: South Asia Pacific
             * *   **north_America**: North America
             * *   **south_America**: South America
             * *   **western_America**: Western United States
             * *   **eastern_America**: Eastern United States
             * *   **european**: Europe
             * *   Valid values if **Vendor** is set to HUAWEICLOUD:
             * *   **cn**: China
             * *   **africa**: Africa
             * *   **latin_america**: Latin America
             * *   **asia**: Asia Pacific
             * *   Valid values if **Vendor** is set to Azure:
             * *   **middle_east**: Middle East
             * *   **south_america**: South America
             * *   **canada**: Canada
             * *   **asia-pacific**: Asia Pacific
             * *   **europe**: Europe
             * *   **africa**: Africa
             * *   **us**: United States
             * *   **other**: other regions
             * *   Valid values if **Vendor** is set to AWS:
             * *   **cn**: China
             * *   **us**: United States
             * *   **eu**: Europe
             * *   **asia**: Asia Pacific
             * *   **south_america**: South America
             * *   **me**: Middle East
             * *   **ca**: Canada
             * *   **af**: Africa
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * Indicates whether the region is configured as a synchronization region on another site. Valid values:
             * <p>
             * 
             * *   **0**: The region is not configured as a synchronization region on another site.
             * *   **1**: The region is configured as a synchronization region on another site.
             */
            public Builder disable(Integer disable) {
                this.disable = disable;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether the region is configured as a synchronization region on this site. Valid values:
             * <p>
             * 
             * *   **0**: The region is configured as a synchronization region on this site.
             * *   **1**: The region is configured as a synchronization region on this site.
             */
            public Builder selected(Integer selected) {
                this.selected = selected;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
