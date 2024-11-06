// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDcdnUserRealTimeDeliveryFieldRequest} extends {@link RequestModel}
 *
 * <p>UpdateDcdnUserRealTimeDeliveryFieldRequest</p>
 */
public class UpdateDcdnUserRealTimeDeliveryFieldRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fields")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fields;

    private UpdateDcdnUserRealTimeDeliveryFieldRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.fields = builder.fields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDcdnUserRealTimeDeliveryFieldRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    public static final class Builder extends Request.Builder<UpdateDcdnUserRealTimeDeliveryFieldRequest, Builder> {
        private String businessType; 
        private String fields; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDcdnUserRealTimeDeliveryFieldRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.fields = request.fields;
        } 

        /**
         * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
         * <ul>
         * <li><strong>cdn_log_access_l1</strong>: access logs of L1 Dynamic Route for CDN (DCDN) points of presence (POPs)</li>
         * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
         * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The list of fields. Separate multiple fields with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/324199.html">Fields in a real-time log</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>body_bytes_sent,client_ip,content_type</p>
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        @Override
        public UpdateDcdnUserRealTimeDeliveryFieldRequest build() {
            return new UpdateDcdnUserRealTimeDeliveryFieldRequest(this);
        } 

    } 

}
