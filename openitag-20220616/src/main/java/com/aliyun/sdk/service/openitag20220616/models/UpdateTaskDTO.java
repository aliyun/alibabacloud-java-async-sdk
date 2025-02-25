// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskDTO} extends {@link TeaModel}
 *
 * <p>UpdateTaskDTO</p>
 */
public class UpdateTaskDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Exif")
    private java.util.Map < String, String > exif;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < String > tags;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private UpdateTaskDTO(Builder builder) {
        this.exif = builder.exif;
        this.remark = builder.remark;
        this.tags = builder.tags;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskDTO create() {
        return builder().build();
    }

    /**
     * @return exif
     */
    public java.util.Map < String, String > getExif() {
        return this.exif;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private java.util.Map < String, String > exif; 
        private String remark; 
        private java.util.List < String > tags; 
        private String taskName; 

        /**
         * Exif.
         */
        public Builder exif(java.util.Map < String, String > exif) {
            this.exif = exif;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public UpdateTaskDTO build() {
            return new UpdateTaskDTO(this);
        } 

    } 

}
