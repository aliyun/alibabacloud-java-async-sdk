// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogMetaRequest} extends {@link RequestModel}
 *
 * <p>GetLogMetaRequest</p>
 */
public class GetLogMetaRequest extends Request {
    @Query
    @NameInMap("LogStore")
    @Validation(required = true)
    private String logStore;

    private GetLogMetaRequest(Builder builder) {
        super(builder);
        this.logStore = builder.logStore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    public static final class Builder extends Request.Builder<GetLogMetaRequest, Builder> {
        private String logStore; 

        private Builder() {
            super();
        } 

        private Builder(GetLogMetaRequest request) {
            super(request);
            this.logStore = request.logStore;
        } 

        /**
         * The name of the dedicated Logstore in which logs are stored.
         * <p>
         * 
         * >  You can call the [DescribeLogMeta](~~DescribeLogMeta~~) operation to query the name of the Logstore.
         */
        public Builder logStore(String logStore) {
            this.putQueryParameter("LogStore", logStore);
            this.logStore = logStore;
            return this;
        }

        @Override
        public GetLogMetaRequest build() {
            return new GetLogMetaRequest(this);
        } 

    } 

}
