// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyObjectGroupOperationRequest} extends {@link RequestModel}
 *
 * <p>ModifyObjectGroupOperationRequest</p>
 */
public class ModifyObjectGroupOperationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> objectList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectOperation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectOperation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private ModifyObjectGroupOperationRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.direction = builder.direction;
        this.lang = builder.lang;
        this.objectList = builder.objectList;
        this.objectOperation = builder.objectOperation;
        this.objectType = builder.objectType;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyObjectGroupOperationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return objectList
     */
    public java.util.List<String> getObjectList() {
        return this.objectList;
    }

    /**
     * @return objectOperation
     */
    public String getObjectOperation() {
        return this.objectOperation;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<ModifyObjectGroupOperationRequest, Builder> {
        private String comment; 
        private String direction; 
        private String lang; 
        private java.util.List<String> objectList; 
        private String objectOperation; 
        private String objectType; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyObjectGroupOperationRequest request) {
            super(request);
            this.comment = request.comment;
            this.direction = request.direction;
            this.lang = request.lang;
            this.objectList = request.objectList;
            this.objectOperation = request.objectOperation;
            this.objectType = request.objectType;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The remarks for the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The traffic direction that is controlled by the access control policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>in</strong>: Inbound traffic.</p>
         * </li>
         * <li><p><strong>out</strong>: Outbound traffic.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The list of objects.</p>
         * <p>This parameter is required.</p>
         */
        public Builder objectList(java.util.List<String> objectList) {
            this.putQueryParameter("ObjectList", objectList);
            this.objectList = objectList;
            return this;
        }

        /**
         * <p>The operation to perform. Valid values:</p>
         * <ul>
         * <li><p><strong>subscribe</strong>: Follows the object.</p>
         * </li>
         * <li><p><strong>unsubscribe</strong>: Unfollows the object.</p>
         * </li>
         * <li><p><strong>ignore</strong>: Adds the object to the whitelist.</p>
         * </li>
         * <li><p><strong>cancelIgnore</strong>: Removes the object from the whitelist.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder objectOperation(String objectOperation) {
            this.putQueryParameter("ObjectOperation", objectOperation);
            this.objectOperation = objectOperation;
            return this;
        }

        /**
         * <p>The type of object to add to the whitelist or follow.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>assetsIp</strong>: Asset IP address.</p>
         * </li>
         * <li><p><strong>destinationIp</strong>: Destination IP address.</p>
         * </li>
         * <li><p><strong>destinationPort</strong>: Destination port.</p>
         * </li>
         * <li><p><strong>destinationDomain</strong>: Destination domain name.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>destinationDomain</p>
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The source IP address of the visitor.</p>
         * 
         * <strong>example:</strong>
         * <p>123.xxx.251.60</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public ModifyObjectGroupOperationRequest build() {
            return new ModifyObjectGroupOperationRequest(this);
        } 

    } 

}
