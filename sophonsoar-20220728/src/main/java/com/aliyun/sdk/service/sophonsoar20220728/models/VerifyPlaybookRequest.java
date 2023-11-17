// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyPlaybookRequest} extends {@link RequestModel}
 *
 * <p>VerifyPlaybookRequest</p>
 */
public class VerifyPlaybookRequest extends Request {
    @Body
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    @Body
    @NameInMap("TaskFlow")
    @Validation(required = true)
    private String taskFlow;

    private VerifyPlaybookRequest(Builder builder) {
        super(builder);
        this.playbookUuid = builder.playbookUuid;
        this.taskFlow = builder.taskFlow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyPlaybookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return taskFlow
     */
    public String getTaskFlow() {
        return this.taskFlow;
    }

    public static final class Builder extends Request.Builder<VerifyPlaybookRequest, Builder> {
        private String playbookUuid; 
        private String taskFlow; 

        private Builder() {
            super();
        } 

        private Builder(VerifyPlaybookRequest request) {
            super(request);
            this.playbookUuid = request.playbookUuid;
            this.taskFlow = request.taskFlow;
        } 

        /**
         * PlaybookUuid.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * TaskFlow.
         */
        public Builder taskFlow(String taskFlow) {
            this.putBodyParameter("TaskFlow", taskFlow);
            this.taskFlow = taskFlow;
            return this;
        }

        @Override
        public VerifyPlaybookRequest build() {
            return new VerifyPlaybookRequest(this);
        } 

    } 

}
