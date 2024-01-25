// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogSampleColumnRequest} extends {@link RequestModel}
 *
 * <p>GetLogSampleColumnRequest</p>
 */
public class GetLogSampleColumnRequest extends Request {
    @Query
    @NameInMap("DataSourceId")
    private Long dataSourceId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetLogSampleColumnRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogSampleColumnRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetLogSampleColumnRequest, Builder> {
        private Long dataSourceId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetLogSampleColumnRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.operaUid = request.operaUid;
        } 

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetLogSampleColumnRequest build() {
            return new GetLogSampleColumnRequest(this);
        } 

    } 

}
