// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link CreateEdgeMachineRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeMachineRequest</p>
 */
public class CreateEdgeMachineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hostname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    @com.aliyun.core.annotation.Validation(required = true)
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sn;

    private CreateEdgeMachineRequest(Builder builder) {
        super(builder);
        this.hostname = builder.hostname;
        this.model = builder.model;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeMachineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder extends Request.Builder<CreateEdgeMachineRequest, Builder> {
        private String hostname; 
        private String model; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeMachineRequest request) {
            super(request);
            this.hostname = request.hostname;
            this.model = request.model;
            this.sn = request.sn;
        } 

        /**
         * <p>The <code>hostname</code> of the cloud-native box.</p>
         * <blockquote>
         * <p> After the cloud-native box is activated, the <code>hostname</code> is automatically modified. The <code>hostname</code> is prefixed with the model and the prefix is followed by a random string.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACK-B-B010-****</p>
         */
        public Builder hostname(String hostname) {
            this.putBodyParameter("hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>The model of the cloud-native box.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACK-V-B010</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The serial number of the cloud-native box.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Q2CB5XZAFBFG****</p>
         */
        public Builder sn(String sn) {
            this.putBodyParameter("sn", sn);
            this.sn = sn;
            return this;
        }

        @Override
        public CreateEdgeMachineRequest build() {
            return new CreateEdgeMachineRequest(this);
        } 

    } 

}
