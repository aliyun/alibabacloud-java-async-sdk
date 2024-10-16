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
    private String codeVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
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
         * CodeVersion.
         */
        public Builder codeVersion(String codeVersion) {
            this.putBodyParameter("CodeVersion", codeVersion);
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * Name.
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
