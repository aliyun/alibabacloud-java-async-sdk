// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlOptimizeAdviceRequest} extends {@link RequestModel}
 *
 * <p>GetSqlOptimizeAdviceRequest</p>
 */
public class GetSqlOptimizeAdviceRequest extends Request {
    @Query
    @NameInMap("ConsoleContext")
    private String consoleContext;

    @Query
    @NameInMap("EndDt")
    private String endDt;

    @Query
    @NameInMap("Engine")
    private String engine;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("StartDt")
    private String startDt;

    private GetSqlOptimizeAdviceRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.endDt = builder.endDt;
        this.engine = builder.engine;
        this.instanceIds = builder.instanceIds;
        this.startDt = builder.startDt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlOptimizeAdviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return endDt
     */
    public String getEndDt() {
        return this.endDt;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return startDt
     */
    public String getStartDt() {
        return this.startDt;
    }

    public static final class Builder extends Request.Builder<GetSqlOptimizeAdviceRequest, Builder> {
        private String consoleContext; 
        private String endDt; 
        private String engine; 
        private String instanceIds; 
        private String startDt; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlOptimizeAdviceRequest response) {
            super(response);
            this.consoleContext = response.consoleContext;
            this.endDt = response.endDt;
            this.engine = response.engine;
            this.instanceIds = response.instanceIds;
            this.startDt = response.startDt;
        } 

        /**
         * ConsoleContext.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * EndDt.
         */
        public Builder endDt(String endDt) {
            this.putQueryParameter("EndDt", endDt);
            this.endDt = endDt;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * StartDt.
         */
        public Builder startDt(String startDt) {
            this.putQueryParameter("StartDt", startDt);
            this.startDt = startDt;
            return this;
        }

        @Override
        public GetSqlOptimizeAdviceRequest build() {
            return new GetSqlOptimizeAdviceRequest(this);
        } 

    } 

}
