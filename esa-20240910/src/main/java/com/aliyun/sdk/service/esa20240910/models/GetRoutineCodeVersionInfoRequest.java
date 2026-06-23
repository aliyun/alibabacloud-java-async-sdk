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
 * {@link GetRoutineCodeVersionInfoRequest} extends {@link RequestModel}
 *
 * <p>GetRoutineCodeVersionInfoRequest</p>
 */
public class GetRoutineCodeVersionInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private GetRoutineCodeVersionInfoRequest(Builder builder) {
        super(builder);
        this.codeVersion = builder.codeVersion;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineCodeVersionInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetRoutineCodeVersionInfoRequest, Builder> {
        private String codeVersion; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetRoutineCodeVersionInfoRequest request) {
            super(request);
            this.codeVersion = request.codeVersion;
            this.name = request.name;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetRoutineCodeVersionInfoRequest build() {
            return new GetRoutineCodeVersionInfoRequest(this);
        } 

    } 

}
