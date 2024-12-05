// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRoutineCodeVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoutineCodeVersionRequest</p>
 */
public class DeleteRoutineCodeVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DeleteRoutineCodeVersionRequest(Builder builder) {
        super(builder);
        this.codeVersion = builder.codeVersion;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoutineCodeVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeVersion
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteRoutineCodeVersionRequest, Builder> {
        private String codeVersion; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoutineCodeVersionRequest request) {
            super(request);
            this.codeVersion = request.codeVersion;
            this.name = request.name;
        } 

        /**
         * <p>The code version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1710120201067203242</p>
         */
        public Builder codeVersion(String codeVersion) {
            this.putBodyParameter("CodeVersion", codeVersion);
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * <p>The routine name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-routine1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteRoutineCodeVersionRequest build() {
            return new DeleteRoutineCodeVersionRequest(this);
        } 

    } 

}
