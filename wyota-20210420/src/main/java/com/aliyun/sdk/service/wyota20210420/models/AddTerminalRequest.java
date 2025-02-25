// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
    private String terminalGroupId;

    private AddTerminalRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.serialNumber = builder.serialNumber;
        this.terminalGroupId = builder.terminalGroupId;
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

    public static final class Builder extends Request.Builder<AddTerminalRequest, Builder> {
        private String alias; 
        private String serialNumber; 
        private String terminalGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddTerminalRequest request) {
            super(request);
            this.alias = request.alias;
            this.serialNumber = request.serialNumber;
            this.terminalGroupId = request.terminalGroupId;
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

        @Override
        public AddTerminalRequest build() {
            return new AddTerminalRequest(this);
        } 

    } 

}
