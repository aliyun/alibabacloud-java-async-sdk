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
 * {@link QuerySharePromotionActivityAuditResultRequest} extends {@link RequestModel}
 *
 * <p>QuerySharePromotionActivityAuditResultRequest</p>
 */
public class QuerySharePromotionActivityAuditResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SharePromotionActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sharePromotionActivityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareTaskCode;

    private QuerySharePromotionActivityAuditResultRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.sharePromotionActivityId = builder.sharePromotionActivityId;
        this.shareTaskCode = builder.shareTaskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySharePromotionActivityAuditResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return sharePromotionActivityId
     */
    public String getSharePromotionActivityId() {
        return this.sharePromotionActivityId;
    }

    /**
     * @return shareTaskCode
     */
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    public static final class Builder extends Request.Builder<QuerySharePromotionActivityAuditResultRequest, Builder> {
        private String iotInstanceId; 
        private String sharePromotionActivityId; 
        private String shareTaskCode; 

        private Builder() {
            super();
        } 

        private Builder(QuerySharePromotionActivityAuditResultRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.sharePromotionActivityId = request.sharePromotionActivityId;
            this.shareTaskCode = request.shareTaskCode;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61******_****<em>4901</em><strong><strong>_47</strong></strong>*******</p>
         */
        public Builder sharePromotionActivityId(String sharePromotionActivityId) {
            this.putBodyParameter("SharePromotionActivityId", sharePromotionActivityId);
            this.sharePromotionActivityId = sharePromotionActivityId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>52******_7<strong>e_4</strong>3_9<strong>e_61</strong>********</p>
         */
        public Builder shareTaskCode(String shareTaskCode) {
            this.putBodyParameter("ShareTaskCode", shareTaskCode);
            this.shareTaskCode = shareTaskCode;
            return this;
        }

        @Override
        public QuerySharePromotionActivityAuditResultRequest build() {
            return new QuerySharePromotionActivityAuditResultRequest(this);
        } 

    } 

}
