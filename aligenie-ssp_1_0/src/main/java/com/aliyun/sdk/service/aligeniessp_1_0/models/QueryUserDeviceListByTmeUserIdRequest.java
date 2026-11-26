// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link QueryUserDeviceListByTmeUserIdRequest} extends {@link RequestModel}
 *
 * <p>QueryUserDeviceListByTmeUserIdRequest</p>
 */
public class QueryUserDeviceListByTmeUserIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TmeUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tmeUserId;

    private QueryUserDeviceListByTmeUserIdRequest(Builder builder) {
        super(builder);
        this.sp = builder.sp;
        this.tmeUserId = builder.tmeUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserDeviceListByTmeUserIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sp
     */
    public String getSp() {
        return this.sp;
    }

    /**
     * @return tmeUserId
     */
    public String getTmeUserId() {
        return this.tmeUserId;
    }

    public static final class Builder extends Request.Builder<QueryUserDeviceListByTmeUserIdRequest, Builder> {
        private String sp; 
        private String tmeUserId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserDeviceListByTmeUserIdRequest request) {
            super(request);
            this.sp = request.sp;
            this.tmeUserId = request.tmeUserId;
        } 

        /**
         * <p>&quot;KG&quot;: KuGou<br>&quot;KW&quot;: Kuwo<br>&quot;QM&quot;: QQ Music</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KG</p>
         */
        public Builder sp(String sp) {
            this.putQueryParameter("Sp", sp);
            this.sp = sp;
            return this;
        }

        /**
         * <p>TME User ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FDEEDE337BAA780793D72F7F20BEF2F5</p>
         */
        public Builder tmeUserId(String tmeUserId) {
            this.putQueryParameter("TmeUserId", tmeUserId);
            this.tmeUserId = tmeUserId;
            return this;
        }

        @Override
        public QueryUserDeviceListByTmeUserIdRequest build() {
            return new QueryUserDeviceListByTmeUserIdRequest(this);
        } 

    } 

}
