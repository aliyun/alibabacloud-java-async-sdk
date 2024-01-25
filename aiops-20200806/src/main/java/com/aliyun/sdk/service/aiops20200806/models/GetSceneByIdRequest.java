// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSceneByIdRequest} extends {@link RequestModel}
 *
 * <p>GetSceneByIdRequest</p>
 */
public class GetSceneByIdRequest extends Request {
    @Query
    @NameInMap("Id")
    private Integer id;

    @Query
    @NameInMap("MetricId")
    private Integer metricId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetSceneByIdRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.metricId = builder.metricId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSceneByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return metricId
     */
    public Integer getMetricId() {
        return this.metricId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetSceneByIdRequest, Builder> {
        private Integer id; 
        private Integer metricId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetSceneByIdRequest request) {
            super(request);
            this.id = request.id;
            this.metricId = request.metricId;
            this.operaUid = request.operaUid;
        } 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MetricId.
         */
        public Builder metricId(Integer metricId) {
            this.putQueryParameter("MetricId", metricId);
            this.metricId = metricId;
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
        public GetSceneByIdRequest build() {
            return new GetSceneByIdRequest(this);
        } 

    } 

}
