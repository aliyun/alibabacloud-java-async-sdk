// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListTaskStepResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskStepResponseBody</p>
 */
public class ListTaskStepResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTaskStepResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskStepResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListTaskStepResponseBody model) {
            this.count = model.count;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The total number of records returned in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of step definitions for the selected task type.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can provide this value for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTaskStepResponseBody build() {
            return new ListTaskStepResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskStepResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskStepResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CategoryEn")
        private String categoryEn;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Data(Builder builder) {
            this.action = builder.action;
            this.category = builder.category;
            this.categoryEn = builder.categoryEn;
            this.index = builder.index;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return categoryEn
         */
        public String getCategoryEn() {
            return this.categoryEn;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String action; 
            private String category; 
            private String categoryEn; 
            private Long index; 
            private String name; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.action = model.action;
                this.category = model.category;
                this.categoryEn = model.categoryEn;
                this.index = model.index;
                this.name = model.name;
            } 

            /**
             * <p>The interaction method of the step. Valid values:</p>
             * <ul>
             * <li><strong>prompt</strong>: Displays step prompts.</li>
             * <li><strong>connection</strong>: Provides connection operations to enter the build or validation environment.</li>
             * <li><strong>prompt_connection</strong>: Provides both prompts and connection operations.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>connection</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The Chinese name of the phase to which the step belongs, such as build environment preparation or test validation.</p>
             * 
             * <strong>example:</strong>
             * <p>制作环境准备</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The English name of the phase to which the step belongs. This field is returned for image creation steps, but may not be returned for application adaptation steps.</p>
             * 
             * <strong>example:</strong>
             * <p>Builder Environment Preparation</p>
             */
            public Builder categoryEn(String categoryEn) {
                this.categoryEn = categoryEn;
                return this;
            }

            /**
             * <p>The numeric index of the step definition, which is used to identify the step and its sequence. Do not treat this value as a completion percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The name identifier of the step, which is used to match the step records returned by GetTask.</p>
             * <p>Steps when Type is set to IMAGE:</p>
             * <ul>
             * <li><strong>INIT</strong>: Initializes the task.</li>
             * <li><strong>CREATE_BUILDER_ENV</strong>: Creates the build environment.</li>
             * <li><strong>DEPLOY_BUILDER_ENV</strong>: Deploys the build environment.</li>
             * <li><strong>INIT_BUILDER</strong>: Initializes the build tool.</li>
             * <li><strong>DOWNLOAD_APP</strong>: Downloads application resources.</li>
             * <li><strong>START_BUILD</strong>: Starts image creation.</li>
             * <li><strong>COMPLETE_INSTALL</strong>: Completes application installation and configuration.</li>
             * <li><strong>CREATE_VALIDATE_ENV</strong>: Creates the validation environment.</li>
             * <li><strong>DEPLOY_VALIDATE_ENV</strong>: Deploys the validation environment.</li>
             * <li><strong>COMPLETE_VALIDATE</strong>: Completes image validation.</li>
             * <li><strong>ARCHIVE_DATA</strong>: Archives image data.</li>
             * <li><strong>CREATE_IMAGE</strong>: Generates the image.</li>
             * <li><strong>FINISH_ADAPT</strong>: Ends the creation process.</li>
             * </ul>
             * <p>Steps when Type is set to ADAPTOR:</p>
             * <ul>
             * <li><strong>INIT</strong>: Initializes the task.</li>
             * <li><strong>CREATE_BUILDER_ENV</strong>: Creates the build environment.</li>
             * <li><strong>DEPLOY_BUILDER_ENV</strong>: Deploys the build environment.</li>
             * <li><strong>INIT_BUILDER</strong>: Initializes the build tool.</li>
             * <li><strong>DOWNLOAD_APP</strong>: Downloads application resources.</li>
             * <li><strong>START_VHD</strong>: Starts application recording.</li>
             * <li><strong>BUILD_VHD</strong>: Generates the application VHD.</li>
             * <li><strong>UPLOAD_VHD</strong>: Uploads the application VHD.</li>
             * <li><strong>COMPLETE_BUILDER</strong>: Completes application creation.</li>
             * <li><strong>CREATE_VALIDATE_ENV</strong>: Creates the validation environment.</li>
             * <li><strong>DEPLOY_VALIDATE_ENV</strong>: Deploys the validation environment.</li>
             * <li><strong>COMPLETE_VALIDATE</strong>: Completes application validation.</li>
             * <li><strong>CREATE_IMAGE</strong>: Generates the application image.</li>
             * <li><strong>FINISH_ADAPT</strong>: Ends the application adaptation process.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATE_BUILDER_ENV</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
