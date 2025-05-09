// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListProductRequest} extends {@link RequestModel}
 *
 * <p>ListProductRequest</p>
 */
public class ListProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("After")
    private String after;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Before")
    private String before;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fields")
    private String fields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WabaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wabaId;

    private ListProductRequest(Builder builder) {
        super(builder);
        this.after = builder.after;
        this.before = builder.before;
        this.catalogId = builder.catalogId;
        this.custSpaceId = builder.custSpaceId;
        this.fields = builder.fields;
        this.limit = builder.limit;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.wabaId = builder.wabaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return after
     */
    public String getAfter() {
        return this.after;
    }

    /**
     * @return before
     */
    public String getBefore() {
        return this.before;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return wabaId
     */
    public String getWabaId() {
        return this.wabaId;
    }

    public static final class Builder extends Request.Builder<ListProductRequest, Builder> {
        private String after; 
        private String before; 
        private String catalogId; 
        private String custSpaceId; 
        private String fields; 
        private Long limit; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String wabaId; 

        private Builder() {
            super();
        } 

        private Builder(ListProductRequest request) {
            super(request);
            this.after = request.after;
            this.before = request.before;
            this.catalogId = request.catalogId;
            this.custSpaceId = request.custSpaceId;
            this.fields = request.fields;
            this.limit = request.limit;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.wabaId = request.wabaId;
        } 

        /**
         * <p>The cursor that points to the end of the page of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>kdkii48jfjjei3</p>
         */
        public Builder after(String after) {
            this.putQueryParameter("After", after);
            this.after = after;
            return this;
        }

        /**
         * <p>The cursor that points to the beginning of the page of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>wiidkd939kek93</p>
         */
        public Builder before(String before) {
            this.putQueryParameter("Before", before);
            this.before = before;
            return this;
        }

        /**
         * <p>The catalog ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>29398389292</p>
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
         * 
         * <strong>example:</strong>
         * <p>C29398388383</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The fields. Separate multiple fields with commas (,).</p>
         * <p> see <a href="https://help.aliyun.com/document_detail/2579419.html">product fields</a></p>
         * 
         * <strong>example:</strong>
         * <p>id,name</p>
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>The number of products to be queried. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the WhatsApp Business account (WABA).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>38487474747</p>
         */
        public Builder wabaId(String wabaId) {
            this.putQueryParameter("WabaId", wabaId);
            this.wabaId = wabaId;
            return this;
        }

        @Override
        public ListProductRequest build() {
            return new ListProductRequest(this);
        } 

    } 

}
