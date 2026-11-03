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
         * <p>The comment for the operation.</p>
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
         * <p>The traffic direction controlled by the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: Inbound traffic.</li>
         * <li><strong>out</strong>: Outbound traffic.</li>
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
         * <p>The language for receiving messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
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
         * <p>The list of objects to operate on.</p>
         * <p>This parameter is required.</p>
         */
        public Builder objectList(java.util.List<String> objectList) {
            this.putQueryParameter("ObjectList", objectList);
            this.objectList = objectList;
            return this;
        }

        /**
         * <p>The operation to perform on the object, such as adding to or removing from a whitelist, or subscribing to or unsubscribing from the object. Valid values:</p>
         * <ul>
         * <li><strong>subscribe</strong>: Subscribes to the object.</li>
         * <li><strong>unsubscribe</strong>: Unsubscribes from the object.</li>
         * <li><strong>ignore</strong>: Adds the object to the whitelist.</li>
         * <li><strong>cancelIgnore</strong>: Removes the object from the whitelist.</li>
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
         * <p>The type of the outbound connection whitelist or subscription. Valid values:</p>
         * <ul>
         * <li><strong>assetsIp</strong>: Asset IP address.</li>
         * <li><strong>destinationIp</strong>: Destination IP address.</li>
         * <li><strong>destinationPort</strong>: Destination port.</li>
         * <li><strong>destinationDomain</strong>: Destination domain name.</li>
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
