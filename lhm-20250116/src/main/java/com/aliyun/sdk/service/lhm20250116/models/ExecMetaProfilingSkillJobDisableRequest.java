// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecMetaProfilingSkillJobDisableRequest} extends {@link RequestModel}
 *
 * <p>ExecMetaProfilingSkillJobDisableRequest</p>
 */
public class ExecMetaProfilingSkillJobDisableRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsId")
    private Long dsId;

    private ExecMetaProfilingSkillJobDisableRequest(Builder builder) {
        super(builder);
        this.dsId = builder.dsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecMetaProfilingSkillJobDisableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dsId
     */
    public Long getDsId() {
        return this.dsId;
    }

    public static final class Builder extends Request.Builder<ExecMetaProfilingSkillJobDisableRequest, Builder> {
        private Long dsId; 

        private Builder() {
            super();
        } 

        private Builder(ExecMetaProfilingSkillJobDisableRequest request) {
            super(request);
            this.dsId = request.dsId;
        } 

        /**
         * dsId.
         */
        public Builder dsId(Long dsId) {
            this.putBodyParameter("dsId", dsId);
            this.dsId = dsId;
            return this;
        }

        @Override
        public ExecMetaProfilingSkillJobDisableRequest build() {
            return new ExecMetaProfilingSkillJobDisableRequest(this);
        } 

    } 

}
