// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetAssetAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetAttributesResponseBody</p>
 */
public class GetAssetAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAssetAttributesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetAttributesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAssetAttributesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
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
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAssetAttributesResponseBody build() {
            return new GetAssetAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetAttributesResponseBody</p>
     */
    public static class AttributeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeCode")
        private String attributeCode;

        @com.aliyun.core.annotation.NameInMap("AttributeName")
        private String attributeName;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private AttributeList(Builder builder) {
            this.attributeCode = builder.attributeCode;
            this.attributeName = builder.attributeName;
            this.required = builder.required;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeList create() {
            return builder().build();
        }

        /**
         * @return attributeCode
         */
        public String getAttributeCode() {
            return this.attributeCode;
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String attributeCode; 
            private String attributeName; 
            private Boolean required; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(AttributeList model) {
                this.attributeCode = model.attributeCode;
                this.attributeName = model.attributeName;
                this.required = model.required;
                this.values = model.values;
            } 

            /**
             * <p>The property code.</p>
             * 
             * <strong>example:</strong>
             * <p>data_level</p>
             */
            public Builder attributeCode(String attributeCode) {
                this.attributeCode = attributeCode;
                return this;
            }

            /**
             * <p>The display name of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Level</p>
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * <p>Indicates whether the property is required.</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The list of property values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public AttributeList build() {
                return new AttributeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAssetAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetAttributesResponseBody</p>
     */
    public static class AssetAttributeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("AttributeList")
        private java.util.List<AttributeList> attributeList;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
        private String lastModifiedTime;

        private AssetAttributeList(Builder builder) {
            this.assetName = builder.assetName;
            this.assetType = builder.assetType;
            this.attributeList = builder.attributeList;
            this.guid = builder.guid;
            this.lastModifiedTime = builder.lastModifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetAttributeList create() {
            return builder().build();
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
         * @return attributeList
         */
        public java.util.List<AttributeList> getAttributeList() {
            return this.attributeList;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public static final class Builder {
            private String assetName; 
            private String assetType; 
            private java.util.List<AttributeList> attributeList; 
            private String guid; 
            private String lastModifiedTime; 

            private Builder() {
            } 

            private Builder(AssetAttributeList model) {
                this.assetName = model.assetName;
                this.assetType = model.assetType;
                this.attributeList = model.attributeList;
                this.guid = model.guid;
                this.lastModifiedTime = model.lastModifiedTime;
            } 

            /**
             * <p>The asset name.</p>
             * 
             * <strong>example:</strong>
             * <p>table_orders</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The asset type.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The list of property values.</p>
             */
            public Builder attributeList(java.util.List<AttributeList> attributeList) {
                this.attributeList = attributeList;
                return this;
            }

            /**
             * <p>The unique identifier of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.project_a.table_orders</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>The last modified time, in the format of yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-01 10:30:00</p>
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            public AssetAttributeList build() {
                return new AssetAttributeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAssetAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetAttributesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetAttributeList")
        private java.util.List<AssetAttributeList> assetAttributeList;

        private Data(Builder builder) {
            this.assetAttributeList = builder.assetAttributeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetAttributeList
         */
        public java.util.List<AssetAttributeList> getAssetAttributeList() {
            return this.assetAttributeList;
        }

        public static final class Builder {
            private java.util.List<AssetAttributeList> assetAttributeList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assetAttributeList = model.assetAttributeList;
            } 

            /**
             * <p>The list of asset properties.</p>
             */
            public Builder assetAttributeList(java.util.List<AssetAttributeList> assetAttributeList) {
                this.assetAttributeList = assetAttributeList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
