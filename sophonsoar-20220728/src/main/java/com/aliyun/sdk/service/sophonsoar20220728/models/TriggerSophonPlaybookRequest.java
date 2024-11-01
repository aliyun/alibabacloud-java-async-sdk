// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TriggerSophonPlaybookRequest} extends {@link RequestModel}
 *
 * <p>TriggerSophonPlaybookRequest</p>
 */
public class TriggerSophonPlaybookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandName")
    private String commandName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SophonTaskId")
    private String sophonTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    private String triggerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private TriggerSophonPlaybookRequest(Builder builder) {
        super(builder);
        this.commandName = builder.commandName;
        this.inputParams = builder.inputParams;
        this.sophonTaskId = builder.sophonTaskId;
        this.triggerType = builder.triggerType;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerSophonPlaybookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandName
     */
    public String getCommandName() {
        return this.commandName;
    }

    /**
     * @return inputParams
     */
    public String getInputParams() {
        return this.inputParams;
    }

    /**
     * @return sophonTaskId
     */
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<TriggerSophonPlaybookRequest, Builder> {
        private String commandName; 
        private String inputParams; 
        private String sophonTaskId; 
        private String triggerType; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(TriggerSophonPlaybookRequest request) {
            super(request);
            this.commandName = request.commandName;
            this.inputParams = request.inputParams;
            this.sophonTaskId = request.sophonTaskId;
            this.triggerType = request.triggerType;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The name of the command that you want to trigger.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSophonCommands~~">DescribeSophonCommands</a> operation to query the command name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>waf_process_command</p>
         */
        public Builder commandName(String commandName) {
            this.putQueryParameter("CommandName", commandName);
            this.commandName = commandName;
            return this;
        }

        /**
         * <p>The input parameters of the command or playbook that you want to trigger.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;param1&quot;: &quot;xx.xx.xx.xx&quot;,
         *     &quot;param2&quot;: &quot;7d&quot;
         * }</p>
         */
        public Builder inputParams(String inputParams) {
            this.putQueryParameter("InputParams", inputParams);
            this.inputParams = inputParams;
            return this;
        }

        /**
         * <p>The custom ID. If you do not specify this parameter when the playbook is triggered, a random ID is generated for fault locating and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>f916b93e-e814-459f-9662-xxxxxxxxxx</p>
         */
        public Builder sophonTaskId(String sophonTaskId) {
            this.putQueryParameter("SophonTaskId", sophonTaskId);
            this.sophonTaskId = sophonTaskId;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>command</strong></li>
         * <li><strong>playbook</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>playbook</p>
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the playbook UUID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>f916b93e-e814-459f-9662-xxxxxxxxxx</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public TriggerSophonPlaybookRequest build() {
            return new TriggerSophonPlaybookRequest(this);
        } 

    } 

}
