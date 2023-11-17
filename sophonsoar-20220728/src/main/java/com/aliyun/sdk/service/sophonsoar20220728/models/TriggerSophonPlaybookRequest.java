// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerSophonPlaybookRequest} extends {@link RequestModel}
 *
 * <p>TriggerSophonPlaybookRequest</p>
 */
public class TriggerSophonPlaybookRequest extends Request {
    @Query
    @NameInMap("CommandName")
    private String commandName;

    @Query
    @NameInMap("InputParams")
    @Validation(required = true)
    private String inputParams;

    @Query
    @NameInMap("SophonTaskId")
    private String sophonTaskId;

    @Query
    @NameInMap("TriggerType")
    private String triggerType;

    @Query
    @NameInMap("Uuid")
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
         * CommandName.
         */
        public Builder commandName(String commandName) {
            this.putQueryParameter("CommandName", commandName);
            this.commandName = commandName;
            return this;
        }

        /**
         * InputParams.
         */
        public Builder inputParams(String inputParams) {
            this.putQueryParameter("InputParams", inputParams);
            this.inputParams = inputParams;
            return this;
        }

        /**
         * SophonTaskId.
         */
        public Builder sophonTaskId(String sophonTaskId) {
            this.putQueryParameter("SophonTaskId", sophonTaskId);
            this.sophonTaskId = sophonTaskId;
            return this;
        }

        /**
         * TriggerType.
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
         * Uuid.
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
