// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ListAICPublicKeysRequest} extends {@link RequestModel}
 *
 * <p>ListAICPublicKeysRequest</p>
 */
public class ListAICPublicKeysRequest extends Request {
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
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private ListAICPublicKeysRequest(Builder builder) {
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

    public static ListAICPublicKeysRequest create() {
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListAICPublicKeysRequest, Builder> {
        private String keyGroup; 
        private String keyName; 
        private String keyType; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAICPublicKeysRequest request) {
            super(request);
            this.keyGroup = request.keyGroup;
            this.keyName = request.keyName;
            this.keyType = request.keyType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>Public key grouping</p>
         * 
         * <strong>example:</strong>
         * <p>g-test</p>
         */
        public Builder keyGroup(String keyGroup) {
            this.putQueryParameter("KeyGroup", keyGroup);
            this.keyGroup = keyGroup;
            return this;
        }

        /**
         * <p>Public key name</p>
         * 
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * <p>Public key type</p>
         * 
         * <strong>example:</strong>
         * <p>adb</p>
         */
        public Builder keyType(String keyType) {
            this.putQueryParameter("KeyType", keyType);
            this.keyType = keyType;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListAICPublicKeysRequest build() {
            return new ListAICPublicKeysRequest(this);
        } 

    } 

}
