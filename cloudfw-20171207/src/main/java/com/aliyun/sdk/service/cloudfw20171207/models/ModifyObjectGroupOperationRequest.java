// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The remarks of the operation.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The direction of the traffic to which the access control policy applies.
         * <p>
         * 
         * Valid values:
         * 
         * *   **in**: inbound.
         * *   **out**: outbound.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh** (default)
         * *   **en**
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The operation objects.
         */
        public Builder objectList(java.util.List < String > objectList) {
            this.putQueryParameter("ObjectList", objectList);
            this.objectList = objectList;
            return this;
        }

        /**
         * The operation. Valid values:
         * <p>
         * 
         * *   **ignore**: adds the operation object to the whitelist.
         * *   **cancelIgnore**: removes the operation object from the whitelist.
         * *   **subscribe**: follows the operation object.
         * *   **unsubscribe**: unfollows the operation object.
         */
        public Builder objectOperation(String objectOperation) {
            this.putQueryParameter("ObjectOperation", objectOperation);
            this.objectOperation = objectOperation;
            return this;
        }

        /**
         * The type of the operation object.
         * <p>
         * 
         * Valid values:
         * 
         * *   **assetsIp**: the asset IP address.
         * *   **destinationIp**: the destination IP address.
         * *   **destinationPort**: the destination port.
         * *   **destinationDomain**: the destination domain name.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * The source IP address of the request.
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
