// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link AddTerminalRequest} extends {@link RequestModel}
 *
 * <p>AddTerminalRequest</p>
 */
public class AddTerminalRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private String clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MainBizType")
    private String mainBizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
    private String terminalGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private AddTerminalRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.clientType = builder.clientType;
        this.mainBizType = builder.mainBizType;
        this.serialNumber = builder.serialNumber;
        this.terminalGroupId = builder.terminalGroupId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTerminalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return mainBizType
     */
    public String getMainBizType() {
        return this.mainBizType;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return terminalGroupId
     */
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<AddTerminalRequest, Builder> {
        private String alias; 
        private String clientType; 
        private String mainBizType; 
        private String serialNumber; 
        private String terminalGroupId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(AddTerminalRequest request) {
            super(request);
            this.alias = request.alias;
            this.clientType = request.clientType;
            this.mainBizType = request.mainBizType;
            this.serialNumber = request.serialNumber;
            this.terminalGroupId = request.terminalGroupId;
            this.uuid = request.uuid;
        } 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.putBodyParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * MainBizType.
         */
        public Builder mainBizType(String mainBizType) {
            this.putBodyParameter("MainBizType", mainBizType);
            this.mainBizType = mainBizType;
            return this;
        }

        /**
         * SerialNumber.
         */
        public Builder serialNumber(String serialNumber) {
            this.putBodyParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * TerminalGroupId.
         */
        public Builder terminalGroupId(String terminalGroupId) {
            this.putBodyParameter("TerminalGroupId", terminalGroupId);
            this.terminalGroupId = terminalGroupId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public AddTerminalRequest build() {
            return new AddTerminalRequest(this);
        } 

    } 

}
