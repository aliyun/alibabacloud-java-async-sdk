// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
    private java.util.List < String > objectList;

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
    public java.util.List < String > getObjectList() {
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
        private java.util.List < String > objectList; 
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
         * <p>The remarks of the operation.</p>
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
         * <p>The direction of the traffic to which the access control policy applies.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound.</li>
         * <li><strong>out</strong>: outbound.</li>
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
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default)</li>
         * <li><strong>en</strong></li>
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
         * <p>The operation objects.</p>
         * <p>This parameter is required.</p>
         */
        public Builder objectList(java.util.List < String > objectList) {
            this.putQueryParameter("ObjectList", objectList);
            this.objectList = objectList;
            return this;
        }

        /**
         * <p>The operation. Valid values:</p>
         * <ul>
         * <li><strong>ignore</strong>: adds the operation object to the whitelist.</li>
         * <li><strong>cancelIgnore</strong>: removes the operation object from the whitelist.</li>
         * <li><strong>subscribe</strong>: follows the operation object.</li>
         * <li><strong>unsubscribe</strong>: unfollows the operation object.</li>
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
         * <p>The type of the operation object.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>assetsIp</strong>: the asset IP address.</li>
         * <li><strong>destinationIp</strong>: the destination IP address.</li>
         * <li><strong>destinationPort</strong>: the destination port.</li>
         * <li><strong>destinationDomain</strong>: the destination domain name.</li>
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
         * <p>The source IP address of the request.</p>
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
