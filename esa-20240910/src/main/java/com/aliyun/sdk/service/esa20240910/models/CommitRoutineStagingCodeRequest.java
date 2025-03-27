// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CommitRoutineStagingCodeRequest} extends {@link RequestModel}
 *
 * <p>CommitRoutineStagingCodeRequest</p>
 */
public class CommitRoutineStagingCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeDescription")
    private String codeDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CommitRoutineStagingCodeRequest(Builder builder) {
        super(builder);
        this.codeDescription = builder.codeDescription;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitRoutineStagingCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeDescription
     */
    public String getCodeDescription() {
        return this.codeDescription;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CommitRoutineStagingCodeRequest, Builder> {
        private String codeDescription; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CommitRoutineStagingCodeRequest request) {
            super(request);
            this.codeDescription = request.codeDescription;
            this.name = request.name;
        } 

        /**
         * <p>The description of the code version.</p>
         * 
         * <strong>example:</strong>
         * <p>description of this code ver</p>
         */
        public Builder codeDescription(String codeDescription) {
            this.putBodyParameter("CodeDescription", codeDescription);
            this.codeDescription = codeDescription;
            return this;
        }

        /**
         * <p>The routine name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CommitRoutineStagingCode</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CommitRoutineStagingCodeRequest build() {
            return new CommitRoutineStagingCodeRequest(this);
        } 

    } 

}
