// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarRecordInOutputRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarRecordInOutputRequest</p>
 */
public class DescribeSoarRecordInOutputRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeSoarRecordInOutputRequest(Builder builder) {
        super(builder);
        this.actionUuid = builder.actionUuid;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarRecordInOutputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionUuid
     */
    public String getActionUuid() {
        return this.actionUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeSoarRecordInOutputRequest, Builder> {
        private String actionUuid; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarRecordInOutputRequest request) {
            super(request);
            this.actionUuid = request.actionUuid;
            this.lang = request.lang;
        } 

        /**
         * The UUID of the component action.
         * <p>
         * 
         * >  You can call the [DescribeSoarTaskAndActions](~~DescribeSoarTaskAndActions~~) operation to query the UUIDs of component actions.
         */
        public Builder actionUuid(String actionUuid) {
            this.putQueryParameter("ActionUuid", actionUuid);
            this.actionUuid = actionUuid;
            return this;
        }

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeSoarRecordInOutputRequest build() {
            return new DescribeSoarRecordInOutputRequest(this);
        } 

    } 

}
