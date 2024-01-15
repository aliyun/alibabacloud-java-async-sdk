// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCustomizedListHeadersRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomizedListHeadersRequest</p>
 */
public class ModifyCustomizedListHeadersRequest extends Request {
    @Query
    @NameInMap("Headers")
    private java.util.List < Headers> headers;

    @Query
    @NameInMap("ListType")
    private String listType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyCustomizedListHeadersRequest(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.listType = builder.listType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomizedListHeadersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.List < Headers> getHeaders() {
        return this.headers;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyCustomizedListHeadersRequest, Builder> {
        private java.util.List < Headers> headers; 
        private String listType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomizedListHeadersRequest request) {
            super(request);
            this.headers = request.headers;
            this.listType = request.listType;
            this.regionId = request.regionId;
        } 

        /**
         * The header of the response.
         */
        public Builder headers(java.util.List < Headers> headers) {
            this.putQueryParameter("Headers", headers);
            this.headers = headers;
            return this;
        }

        /**
         * The type of the list.
         */
        public Builder listType(String listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyCustomizedListHeadersRequest build() {
            return new ModifyCustomizedListHeadersRequest(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("DisplayType")
        private String displayType;

        @NameInMap("HeaderKey")
        private String headerKey;

        private Headers(Builder builder) {
            this.displayType = builder.displayType;
            this.headerKey = builder.headerKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return headerKey
         */
        public String getHeaderKey() {
            return this.headerKey;
        }

        public static final class Builder {
            private String displayType; 
            private String headerKey; 

            /**
             * The display type of the header. You can call the `ModifyCustomizedListHeaders` operation to modify the display type of the header.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * The key of the header.
             */
            public Builder headerKey(String headerKey) {
                this.headerKey = headerKey;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
}
