// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link AddVirusScanAdditionalListsRequest} extends {@link RequestModel}
 *
 * <p>AddVirusScanAdditionalListsRequest</p>
 */
public class AddVirusScanAdditionalListsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdditionalLists")
    private java.util.List<AdditionalLists> additionalLists;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devType;

    private AddVirusScanAdditionalListsRequest(Builder builder) {
        super(builder);
        this.additionalLists = builder.additionalLists;
        this.devType = builder.devType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVirusScanAdditionalListsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalLists
     */
    public java.util.List<AdditionalLists> getAdditionalLists() {
        return this.additionalLists;
    }

    /**
     * @return devType
     */
    public String getDevType() {
        return this.devType;
    }

    public static final class Builder extends Request.Builder<AddVirusScanAdditionalListsRequest, Builder> {
        private java.util.List<AdditionalLists> additionalLists; 
        private String devType; 

        private Builder() {
            super();
        } 

        private Builder(AddVirusScanAdditionalListsRequest request) {
            super(request);
            this.additionalLists = request.additionalLists;
            this.devType = request.devType;
        } 

        /**
         * AdditionalLists.
         */
        public Builder additionalLists(java.util.List<AdditionalLists> additionalLists) {
            this.putBodyParameter("AdditionalLists", additionalLists);
            this.additionalLists = additionalLists;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        public Builder devType(String devType) {
            this.putBodyParameter("DevType", devType);
            this.devType = devType;
            return this;
        }

        @Override
        public AddVirusScanAdditionalListsRequest build() {
            return new AddVirusScanAdditionalListsRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddVirusScanAdditionalListsRequest} extends {@link TeaModel}
     *
     * <p>AddVirusScanAdditionalListsRequest</p>
     */
    public static class AdditionalLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalType")
        private String additionalType;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("ListType")
        private String listType;

        private AdditionalLists(Builder builder) {
            this.additionalType = builder.additionalType;
            this.detail = builder.detail;
            this.listType = builder.listType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalLists create() {
            return builder().build();
        }

        /**
         * @return additionalType
         */
        public String getAdditionalType() {
            return this.additionalType;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return listType
         */
        public String getListType() {
            return this.listType;
        }

        public static final class Builder {
            private String additionalType; 
            private String detail; 
            private String listType; 

            private Builder() {
            } 

            private Builder(AdditionalLists model) {
                this.additionalType = model.additionalType;
                this.detail = model.detail;
                this.listType = model.listType;
            } 

            /**
             * AdditionalType.
             */
            public Builder additionalType(String additionalType) {
                this.additionalType = additionalType;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * ListType.
             */
            public Builder listType(String listType) {
                this.listType = listType;
                return this;
            }

            public AdditionalLists build() {
                return new AdditionalLists(this);
            } 

        } 

    }
}
