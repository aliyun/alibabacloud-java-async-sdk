// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link TensorboardDataSourceSpec} extends {@link TeaModel}
 *
 * <p>TensorboardDataSourceSpec</p>
 */
public class TensorboardDataSourceSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("DirectoryName")
    private String directoryName;

    @com.aliyun.core.annotation.NameInMap("FullSummaryPath")
    private String fullSummaryPath;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("SummaryPath")
    private String summaryPath;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private TensorboardDataSourceSpec(Builder builder) {
        this.dataSourceType = builder.dataSourceType;
        this.directoryName = builder.directoryName;
        this.fullSummaryPath = builder.fullSummaryPath;
        this.id = builder.id;
        this.name = builder.name;
        this.sourceType = builder.sourceType;
        this.summaryPath = builder.summaryPath;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TensorboardDataSourceSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return directoryName
     */
    public String getDirectoryName() {
        return this.directoryName;
    }

    /**
     * @return fullSummaryPath
     */
    public String getFullSummaryPath() {
        return this.fullSummaryPath;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return summaryPath
     */
    public String getSummaryPath() {
        return this.summaryPath;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String dataSourceType; 
        private String directoryName; 
        private String fullSummaryPath; 
        private String id; 
        private String name; 
        private String sourceType; 
        private String summaryPath; 
        private String uri; 

        private Builder() {
        } 

        private Builder(TensorboardDataSourceSpec model) {
            this.dataSourceType = model.dataSourceType;
            this.directoryName = model.directoryName;
            this.fullSummaryPath = model.fullSummaryPath;
            this.id = model.id;
            this.name = model.name;
            this.sourceType = model.sourceType;
            this.summaryPath = model.summaryPath;
            this.uri = model.uri;
        } 

        /**
         * <p>The file type that corresponds to the URI in the dataset configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The directory prefix of the dataset in the TensorBoard task.</p>
         * 
         * <strong>example:</strong>
         * <p>dlcJobName</p>
         */
        public Builder directoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }

        /**
         * <p>The full summary path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://xxxxx/tensorboard/run1</p>
         */
        public Builder fullSummaryPath(String fullSummaryPath) {
            this.fullSummaryPath = fullSummaryPath;
            return this;
        }

        /**
         * <p>The ID of the dataset configurations. In most cases, the ID of the dataset configurations is the ID of a dataset or task.</p>
         * 
         * <strong>example:</strong>
         * <p>d-vf2fdhxxxxxx</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the dataset configurations. In most cases, the name of the dataset configurations is the name of a dataset or task.</p>
         * 
         * <strong>example:</strong>
         * <p>dlcJobName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The dataset type.</p>
         * <ul>
         * <li>datasource: configure a dataset based on the dataset type.</li>
         * <li>dlcjob: configure a dataset based on the task type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>datasource</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The summary path.</p>
         * 
         * <strong>example:</strong>
         * <p>/tensorboard/run1</p>
         */
        public Builder summaryPath(String summaryPath) {
            this.summaryPath = summaryPath;
            return this;
        }

        /**
         * <p>The file system URI in the dataset configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://.oss-cn-shanghai-finance-1.aliyuncs.com/</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public TensorboardDataSourceSpec build() {
            return new TensorboardDataSourceSpec(this);
        } 

    } 

}
