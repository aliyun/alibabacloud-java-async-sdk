// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link GetTableMetaInfoRequest} extends {@link RequestModel}
 *
 * <p>GetTableMetaInfoRequest</p>
 */
public class GetTableMetaInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceDialect")
    private String sourceDialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceSqlScript")
    private String sourceSqlScript;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetDialect")
    private String targetDialect;

    private GetTableMetaInfoRequest(Builder builder) {
        super(builder);
        this.sourceDialect = builder.sourceDialect;
        this.sourceSqlScript = builder.sourceSqlScript;
        this.targetDialect = builder.targetDialect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableMetaInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceDialect
     */
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    /**
     * @return sourceSqlScript
     */
    public String getSourceSqlScript() {
        return this.sourceSqlScript;
    }

    /**
     * @return targetDialect
     */
    public String getTargetDialect() {
        return this.targetDialect;
    }

    public static final class Builder extends Request.Builder<GetTableMetaInfoRequest, Builder> {
        private String sourceDialect; 
        private String sourceSqlScript; 
        private String targetDialect; 

        private Builder() {
            super();
        } 

        private Builder(GetTableMetaInfoRequest request) {
            super(request);
            this.sourceDialect = request.sourceDialect;
            this.sourceSqlScript = request.sourceSqlScript;
            this.targetDialect = request.targetDialect;
        } 

        /**
         * sourceDialect.
         */
        public Builder sourceDialect(String sourceDialect) {
            this.putBodyParameter("sourceDialect", sourceDialect);
            this.sourceDialect = sourceDialect;
            return this;
        }

        /**
         * sourceSqlScript.
         */
        public Builder sourceSqlScript(String sourceSqlScript) {
            this.putBodyParameter("sourceSqlScript", sourceSqlScript);
            this.sourceSqlScript = sourceSqlScript;
            return this;
        }

        /**
         * targetDialect.
         */
        public Builder targetDialect(String targetDialect) {
            this.putBodyParameter("targetDialect", targetDialect);
            this.targetDialect = targetDialect;
            return this;
        }

        @Override
        public GetTableMetaInfoRequest build() {
            return new GetTableMetaInfoRequest(this);
        } 

    } 

}
