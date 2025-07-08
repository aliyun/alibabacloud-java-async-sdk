// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link UpdateSlsStatusNewResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSlsStatusNewResponseBody</p>
 */
public class UpdateSlsStatusNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizeStatus")
    private Boolean authorizeStatus;

    @com.aliyun.core.annotation.NameInMap("OpenStatus")
    private Boolean openStatus;

    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SaveTime")
    private Integer saveTime;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private UpdateSlsStatusNewResponseBody(Builder builder) {
        this.authorizeStatus = builder.authorizeStatus;
        this.openStatus = builder.openStatus;
        this.prodCode = builder.prodCode;
        this.requestId = builder.requestId;
        this.saveTime = builder.saveTime;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSlsStatusNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizeStatus
     */
    public Boolean getAuthorizeStatus() {
        return this.authorizeStatus;
    }

    /**
     * @return openStatus
     */
    public Boolean getOpenStatus() {
        return this.openStatus;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return saveTime
     */
    public Integer getSaveTime() {
        return this.saveTime;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private Boolean authorizeStatus; 
        private Boolean openStatus; 
        private String prodCode; 
        private String requestId; 
        private Integer saveTime; 
        private String uid; 

        private Builder() {
        } 

        private Builder(UpdateSlsStatusNewResponseBody model) {
            this.authorizeStatus = model.authorizeStatus;
            this.openStatus = model.openStatus;
            this.prodCode = model.prodCode;
            this.requestId = model.requestId;
            this.saveTime = model.saveTime;
            this.uid = model.uid;
        } 

        /**
         * AuthorizeStatus.
         */
        public Builder authorizeStatus(Boolean authorizeStatus) {
            this.authorizeStatus = authorizeStatus;
            return this;
        }

        /**
         * OpenStatus.
         */
        public Builder openStatus(Boolean openStatus) {
            this.openStatus = openStatus;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SaveTime.
         */
        public Builder saveTime(Integer saveTime) {
            this.saveTime = saveTime;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public UpdateSlsStatusNewResponseBody build() {
            return new UpdateSlsStatusNewResponseBody(this);
        } 

    } 

}
