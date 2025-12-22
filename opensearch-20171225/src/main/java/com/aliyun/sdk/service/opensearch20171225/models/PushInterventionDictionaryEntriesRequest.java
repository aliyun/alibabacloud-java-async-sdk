// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link PushInterventionDictionaryEntriesRequest} extends {@link RequestModel}
 *
 * <p>PushInterventionDictionaryEntriesRequest</p>
 */
public class PushInterventionDictionaryEntriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<java.util.Map<String, ?>> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private PushInterventionDictionaryEntriesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.body = builder.body;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushInterventionDictionaryEntriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return body
     */
    public java.util.List<java.util.Map<String, ?>> getBody() {
        return this.body;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<PushInterventionDictionaryEntriesRequest, Builder> {
        private String name; 
        private java.util.List<java.util.Map<String, ?>> body; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(PushInterventionDictionaryEntriesRequest request) {
            super(request);
            this.name = request.name;
            this.body = request.body;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The name of the intervention dictionary.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_dict</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The request body.</p>
         */
        public Builder body(java.util.List<java.util.Map<String, ?>> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>Specifies whether to check the validity of input parameters. Default value: false.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: checks only the validity of input parameters.</li>
         * <li><strong>false</strong>: checks the validity of input parameters and creates an attribution configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public PushInterventionDictionaryEntriesRequest build() {
            return new PushInterventionDictionaryEntriesRequest(this);
        } 

    } 

}
