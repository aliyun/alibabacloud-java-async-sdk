// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDiagnoseIndicesRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnoseIndicesRequest</p>
 */
public class ListDiagnoseIndicesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    private ListDiagnoseIndicesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnoseIndicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<ListDiagnoseIndicesRequest, Builder> {
        private String instanceId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ListDiagnoseIndicesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language. Multiple languages are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ListDiagnoseIndicesRequest build() {
            return new ListDiagnoseIndicesRequest(this);
        } 

    } 

}
