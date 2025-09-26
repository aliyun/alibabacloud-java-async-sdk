// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link DeleteCodeInterpreterOut} extends {@link TeaModel}
 *
 * <p>DeleteCodeInterpreterOut</p>
 */
public class DeleteCodeInterpreterOut extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeInterpreterId")
    private String codeInterpreterId;

    @com.aliyun.core.annotation.NameInMap("codeInterpreterName")
    private String codeInterpreterName;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private DeleteCodeInterpreterOut(Builder builder) {
        this.codeInterpreterId = builder.codeInterpreterId;
        this.codeInterpreterName = builder.codeInterpreterName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCodeInterpreterOut create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeInterpreterId
     */
    public String getCodeInterpreterId() {
        return this.codeInterpreterId;
    }

    /**
     * @return codeInterpreterName
     */
    public String getCodeInterpreterName() {
        return this.codeInterpreterName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String codeInterpreterId; 
        private String codeInterpreterName; 
        private String status; 

        private Builder() {
        } 

        private Builder(DeleteCodeInterpreterOut model) {
            this.codeInterpreterId = model.codeInterpreterId;
            this.codeInterpreterName = model.codeInterpreterName;
            this.status = model.status;
        } 

        /**
         * codeInterpreterId.
         */
        public Builder codeInterpreterId(String codeInterpreterId) {
            this.codeInterpreterId = codeInterpreterId;
            return this;
        }

        /**
         * codeInterpreterName.
         */
        public Builder codeInterpreterName(String codeInterpreterName) {
            this.codeInterpreterName = codeInterpreterName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeleteCodeInterpreterOut build() {
            return new DeleteCodeInterpreterOut(this);
        } 

    } 

}
