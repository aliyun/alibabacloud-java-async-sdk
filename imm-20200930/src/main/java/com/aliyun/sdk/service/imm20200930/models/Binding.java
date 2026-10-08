// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Binding} extends {@link TeaModel}
 *
 * <p>Binding</p>
 */
public class Binding extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("URI")
    private String URI;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private Binding(Builder builder) {
        this.createTime = builder.createTime;
        this.datasetName = builder.datasetName;
        this.phase = builder.phase;
        this.projectName = builder.projectName;
        this.reason = builder.reason;
        this.state = builder.state;
        this.URI = builder.URI;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Binding create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String datasetName; 
        private String phase; 
        private String projectName; 
        private String reason; 
        private String state; 
        private String URI; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(Binding model) {
            this.createTime = model.createTime;
            this.datasetName = model.datasetName;
            this.phase = model.phase;
            this.projectName = model.projectName;
            this.reason = model.reason;
            this.state = model.state;
            this.URI = model.URI;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The timestamp when the binding between the dataset and the OSS bucket was created. The format is RFC3339Nano.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset001</p>
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The scan type. Valid values:</p>
         * <ul>
         * <li><p>FullScanning: A full scan is in progress.</p>
         * </li>
         * <li><p>IncrementalScanning: An incremental scan is in progress.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullScanning</p>
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Reason</p>
         * 
         * <strong>example:</strong>
         * <p>pause usage</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The state of the binding between the dataset and the OSS bucket. Valid values:</p>
         * <ul>
         * <li><p>Ready: The binding is being prepared after it is created.</p>
         * </li>
         * <li><p>Stopped: The binding is paused.</p>
         * </li>
         * <li><p>Running: The binding is running.</p>
         * </li>
         * <li><p>Retrying: The binding is being retried after it is created.</p>
         * </li>
         * <li><p>Failed: The binding failed to be created.</p>
         * </li>
         * <li><p>Deleted: The binding is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The URI of the Object Storage Service (OSS) bucket attached to the dataset.</p>
         * <p>The format of an OSS bucket URI is <code>oss://${bucketname}</code>. The <code>bucketname</code> is the name of an OSS bucket that is in the same region as the current project.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket</p>
         */
        public Builder URI(String URI) {
            this.URI = URI;
            return this;
        }

        /**
         * <p>The timestamp when the binding between the dataset and the OSS bucket was last modified. The format is RFC3339Nano.</p>
         * <blockquote>
         * <p>After a binding is created, if the binding has not been paused or restarted, this timestamp is the same as the creation timestamp.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Binding build() {
            return new Binding(this);
        } 

    } 

}
