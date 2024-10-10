// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCloudVendorRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudVendorRegionsResponseBody</p>
 */
public class ListCloudVendorRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The regions that the service provider supports.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C87EC6AD-4590-5546-9DF6-B8956579D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCloudVendorRegionsResponseBody build() {
            return new ListCloudVendorRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudVendorRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudVendorRegionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("Disable")
        private Integer disable;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Selected")
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
             * <p>The area to which the region belongs. The valid values vary based on the value of the Vendor parameter.</p>
             * <ul>
             * <li>Valid values if <strong>Vendor</strong> is set to Tencent:</li>
             * <li><strong>cn</strong>: China</li>
             * <li><strong>southeast_asia</strong>: Southeast Asia Pacific</li>
             * <li><strong>northeast_asia</strong>: Northeast Asia Pacific</li>
             * <li><strong>southern_asia</strong>: South Asia Pacific</li>
             * <li><strong>north_America</strong>: North America</li>
             * <li><strong>south_America</strong>: South America</li>
             * <li><strong>western_America</strong>: Western United States</li>
             * <li><strong>eastern_America</strong>: Eastern United States</li>
             * <li><strong>european</strong>: Europe</li>
             * <li>Valid values if <strong>Vendor</strong> is set to HUAWEICLOUD:</li>
             * <li><strong>cn</strong>: China</li>
             * <li><strong>africa</strong>: Africa</li>
             * <li><strong>latin_america</strong>: Latin America</li>
             * <li><strong>asia</strong>: Asia Pacific</li>
             * <li>Valid values if <strong>Vendor</strong> is set to Azure:</li>
             * <li><strong>middle_east</strong>: Middle East</li>
             * <li><strong>south_america</strong>: South America</li>
             * <li><strong>canada</strong>: Canada</li>
             * <li><strong>asia-pacific</strong>: Asia Pacific</li>
             * <li><strong>europe</strong>: Europe</li>
             * <li><strong>africa</strong>: Africa</li>
             * <li><strong>us</strong>: United States</li>
             * <li><strong>other</strong>: other regions</li>
             * <li>Valid values if <strong>Vendor</strong> is set to AWS:</li>
             * <li><strong>cn</strong>: China</li>
             * <li><strong>us</strong>: United States</li>
             * <li><strong>eu</strong>: Europe</li>
             * <li><strong>asia</strong>: Asia Pacific</li>
             * <li><strong>south_america</strong>: South America</li>
             * <li><strong>me</strong>: Middle East</li>
             * <li><strong>ca</strong>: Canada</li>
             * <li><strong>af</strong>: Africa</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>Indicates whether the region is configured as a synchronization region on another site. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The region is not configured as a synchronization region on another site.</li>
             * <li><strong>1</strong>: The region is configured as a synchronization region on another site.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder disable(Integer disable) {
                this.disable = disable;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Indicates whether the region is configured as a synchronization region on this site. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The region is not configured as a synchronization region on this site.</li>
             * <li><strong>1</strong>: The region is configured as a synchronization region on this site.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
