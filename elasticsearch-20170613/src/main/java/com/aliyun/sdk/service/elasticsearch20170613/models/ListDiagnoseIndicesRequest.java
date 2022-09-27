// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnoseIndicesRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnoseIndicesRequest</p>
 */
public class ListDiagnoseIndicesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("lang")
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * lang.
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
