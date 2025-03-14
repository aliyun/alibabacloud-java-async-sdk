// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link QueryJenkinsImageRegistryPersistenceDayRequest} extends {@link RequestModel}
 *
 * <p>QueryJenkinsImageRegistryPersistenceDayRequest</p>
 */
public class QueryJenkinsImageRegistryPersistenceDayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private QueryJenkinsImageRegistryPersistenceDayRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJenkinsImageRegistryPersistenceDayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<QueryJenkinsImageRegistryPersistenceDayRequest, Builder> {
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryJenkinsImageRegistryPersistenceDayRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>113.83.XXX.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public QueryJenkinsImageRegistryPersistenceDayRequest build() {
            return new QueryJenkinsImageRegistryPersistenceDayRequest(this);
        } 

    } 

}
