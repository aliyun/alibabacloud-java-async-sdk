// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryCertUrlByApplyIdRequest} extends {@link RequestModel}
 *
 * <p>QueryCertUrlByApplyIdRequest</p>
 */
public class QueryCertUrlByApplyIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long applyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private QueryCertUrlByApplyIdRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCertUrlByApplyIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<QueryCertUrlByApplyIdRequest, Builder> {
        private Long applyId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCertUrlByApplyIdRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>The application ID. You can view the application ID in the result that is returned by the <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a> or <a href="https://help.aliyun.com/document_detail/69473.html">BatchRegisterDevice</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("ApplyId", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>You can obtain the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console. If your instance has an ID, you must specify this parameter. Otherwise, the request fails.</p>
         * <blockquote>
         * <p>The ID of a public instance may not be displayed on the Overview page. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How do I obtain an instance ID?</a></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public QueryCertUrlByApplyIdRequest build() {
            return new QueryCertUrlByApplyIdRequest(this);
        } 

    } 

}
