// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineWithAssetsCodeVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineWithAssetsCodeVersionRequest</p>
 */
public class CreateRoutineWithAssetsCodeVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuildId")
    private Long buildId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeDescription")
    private String codeDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfOptions")
    private ConfOptions confOptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateRoutineWithAssetsCodeVersionRequest(Builder builder) {
        super(builder);
        this.buildId = builder.buildId;
        this.codeDescription = builder.codeDescription;
        this.confOptions = builder.confOptions;
        this.extraInfo = builder.extraInfo;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineWithAssetsCodeVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildId
     */
    public Long getBuildId() {
        return this.buildId;
    }

    /**
     * @return codeDescription
     */
    public String getCodeDescription() {
        return this.codeDescription;
    }

    /**
     * @return confOptions
     */
    public ConfOptions getConfOptions() {
        return this.confOptions;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateRoutineWithAssetsCodeVersionRequest, Builder> {
        private Long buildId; 
        private String codeDescription; 
        private ConfOptions confOptions; 
        private String extraInfo; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineWithAssetsCodeVersionRequest request) {
            super(request);
            this.buildId = request.buildId;
            this.codeDescription = request.codeDescription;
            this.confOptions = request.confOptions;
            this.extraInfo = request.extraInfo;
            this.name = request.name;
        } 

        /**
         * BuildId.
         */
        public Builder buildId(Long buildId) {
            this.putBodyParameter("BuildId", buildId);
            this.buildId = buildId;
            return this;
        }

        /**
         * CodeDescription.
         */
        public Builder codeDescription(String codeDescription) {
            this.putBodyParameter("CodeDescription", codeDescription);
            this.codeDescription = codeDescription;
            return this;
        }

        /**
         * ConfOptions.
         */
        public Builder confOptions(ConfOptions confOptions) {
            String confOptionsShrink = shrink(confOptions, "ConfOptions", "json");
            this.putBodyParameter("ConfOptions", confOptionsShrink);
            this.confOptions = confOptions;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putBodyParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateRoutineWithAssetsCodeVersionRequest build() {
            return new CreateRoutineWithAssetsCodeVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRoutineWithAssetsCodeVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateRoutineWithAssetsCodeVersionRequest</p>
     */
    public static class ConfOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotFoundStrategy")
        private String notFoundStrategy;

        private ConfOptions(Builder builder) {
            this.notFoundStrategy = builder.notFoundStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfOptions create() {
            return builder().build();
        }

        /**
         * @return notFoundStrategy
         */
        public String getNotFoundStrategy() {
            return this.notFoundStrategy;
        }

        public static final class Builder {
            private String notFoundStrategy; 

            private Builder() {
            } 

            private Builder(ConfOptions model) {
                this.notFoundStrategy = model.notFoundStrategy;
            } 

            /**
             * NotFoundStrategy.
             */
            public Builder notFoundStrategy(String notFoundStrategy) {
                this.notFoundStrategy = notFoundStrategy;
                return this;
            }

            public ConfOptions build() {
                return new ConfOptions(this);
            } 

        } 

    }
}
