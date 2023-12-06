// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>GetEnvironmentRequest</p>
 */
public class GetEnvironmentRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Query
    @NameInMap("options")
    private Options options;

    private GetEnvironmentRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return options
     */
    public Options getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<GetEnvironmentRequest, Builder> {
        private String uid; 
        private Options options; 

        private Builder() {
            super();
        } 

        private Builder(GetEnvironmentRequest request) {
            super(request);
            this.uid = request.uid;
            this.options = request.options;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * options.
         */
        public Builder options(Options options) {
            String optionsShrink = shrink(options, "options", "json");
            this.putQueryParameter("options", optionsShrink);
            this.options = options;
            return this;
        }

        @Override
        public GetEnvironmentRequest build() {
            return new GetEnvironmentRequest(this);
        } 

    } 

    public static class Options extends TeaModel {
        @NameInMap("withSiteSurveyReport")
        private Boolean withSiteSurveyReport;

        private Options(Builder builder) {
            this.withSiteSurveyReport = builder.withSiteSurveyReport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return withSiteSurveyReport
         */
        public Boolean getWithSiteSurveyReport() {
            return this.withSiteSurveyReport;
        }

        public static final class Builder {
            private Boolean withSiteSurveyReport; 

            /**
             * withSiteSurveyReport.
             */
            public Builder withSiteSurveyReport(Boolean withSiteSurveyReport) {
                this.withSiteSurveyReport = withSiteSurveyReport;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
}
