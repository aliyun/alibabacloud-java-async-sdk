// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ListTextbookAssistantGradeVolumesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTextbookAssistantGradeVolumesResponseBody</p>
 */
public class ListTextbookAssistantGradeVolumesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListTextbookAssistantGradeVolumesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantGradeVolumesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTextbookAssistantGradeVolumesResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>未知错误</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F3B1AAF2-3041-5AA7-A352-BD5F998FA465</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTextbookAssistantGradeVolumesResponseBody build() {
            return new ListTextbookAssistantGradeVolumesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTextbookAssistantGradeVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantGradeVolumesResponseBody</p>
     */
    public static class GradeVolumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("grade")
        private String grade;

        @com.aliyun.core.annotation.NameInMap("volume")
        private String volume;

        private GradeVolumes(Builder builder) {
            this.grade = builder.grade;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GradeVolumes create() {
            return builder().build();
        }

        /**
         * @return grade
         */
        public String getGrade() {
            return this.grade;
        }

        /**
         * @return volume
         */
        public String getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String grade; 
            private String volume; 

            private Builder() {
            } 

            private Builder(GradeVolumes model) {
                this.grade = model.grade;
                this.volume = model.volume;
            } 

            /**
             * <p>The grade level. Valid values: 1 to 9.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder grade(String grade) {
                this.grade = grade;
                return this;
            }

            /**
             * <p>The volume. Valid values: <code>0</code> (single volume), <code>1</code> (Volume 1), and <code>2</code> (Volume 2).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder volume(String volume) {
                this.volume = volume;
                return this;
            }

            public GradeVolumes build() {
                return new GradeVolumes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantGradeVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantGradeVolumesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gradeVolumes")
        private java.util.List<GradeVolumes> gradeVolumes;

        @com.aliyun.core.annotation.NameInMap("textbookVersion")
        private String textbookVersion;

        private Data(Builder builder) {
            this.gradeVolumes = builder.gradeVolumes;
            this.textbookVersion = builder.textbookVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gradeVolumes
         */
        public java.util.List<GradeVolumes> getGradeVolumes() {
            return this.gradeVolumes;
        }

        /**
         * @return textbookVersion
         */
        public String getTextbookVersion() {
            return this.textbookVersion;
        }

        public static final class Builder {
            private java.util.List<GradeVolumes> gradeVolumes; 
            private String textbookVersion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gradeVolumes = model.gradeVolumes;
                this.textbookVersion = model.textbookVersion;
            } 

            /**
             * <p>The grade and volume information.</p>
             */
            public Builder gradeVolumes(java.util.List<GradeVolumes> gradeVolumes) {
                this.gradeVolumes = gradeVolumes;
                return this;
            }

            /**
             * <p>The version of the textbook.</p>
             * 
             * <strong>example:</strong>
             * <p>人教版</p>
             */
            public Builder textbookVersion(String textbookVersion) {
                this.textbookVersion = textbookVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
