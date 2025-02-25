// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ListPublicKeysRequest} extends {@link RequestModel}
 *
 * <p>ListPublicKeysRequest</p>
 */
public class ListPublicKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyGroup")
    private String keyGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    private String keyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyType")
    private String keyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    private ListPublicKeysRequest(Builder builder) {
        super(builder);
        this.keyGroup = builder.keyGroup;
        this.keyName = builder.keyName;
        this.keyType = builder.keyType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicKeysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyGroup
     */
    public String getKeyGroup() {
        return this.keyGroup;
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * @return keyType
     */
    public String getKeyType() {
        return this.keyType;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListPublicKeysRequest, Builder> {
        private String keyGroup; 
        private String keyName; 
        private String keyType; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListPublicKeysRequest request) {
            super(request);
            this.keyGroup = request.keyGroup;
            this.keyName = request.keyName;
            this.keyType = request.keyType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * KeyGroup.
         */
        public Builder keyGroup(String keyGroup) {
            this.putQueryParameter("KeyGroup", keyGroup);
            this.keyGroup = keyGroup;
            return this;
        }

        /**
         * KeyName.
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * KeyType.
         */
        public Builder keyType(String keyType) {
            this.putQueryParameter("KeyType", keyType);
            this.keyType = keyType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListPublicKeysRequest build() {
            return new ListPublicKeysRequest(this);
        } 

    } 

}
