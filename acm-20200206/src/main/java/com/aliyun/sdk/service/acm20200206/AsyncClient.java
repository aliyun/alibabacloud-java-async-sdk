// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.acm20200206.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<BatchExportConfigurationsResponse> batchExportConfigurations(BatchExportConfigurationsRequest request);

    CompletableFuture<BatchImportConfigurationsResponse> batchImportConfigurations(BatchImportConfigurationsRequest request);

    CompletableFuture<CheckConfigurationCloneResponse> checkConfigurationClone(CheckConfigurationCloneRequest request);

    CompletableFuture<CheckConfigurationExportResponse> checkConfigurationExport(CheckConfigurationExportRequest request);

    CompletableFuture<CloneConfigurationResponse> cloneConfiguration(CloneConfigurationRequest request);

    CompletableFuture<CreateConfigurationResponse> createConfiguration(CreateConfigurationRequest request);

    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    CompletableFuture<DeleteConfigurationResponse> deleteConfiguration(DeleteConfigurationRequest request);

    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DeployConfigurationResponse> deployConfiguration(DeployConfigurationRequest request);

    CompletableFuture<DescribeConfigurationResponse> describeConfiguration(DescribeConfigurationRequest request);

    CompletableFuture<DescribeImportFileUrlResponse> describeImportFileUrl(DescribeImportFileUrlRequest request);

    CompletableFuture<DescribeNamespaceResponse> describeNamespace(DescribeNamespaceRequest request);

    CompletableFuture<DescribeNamespacesResponse> describeNamespaces(DescribeNamespacesRequest request);

    CompletableFuture<DescribeNamespacesWithCreateResponse> describeNamespacesWithCreate(DescribeNamespacesWithCreateRequest request);

    CompletableFuture<DescribeTraceByConfigurationResponse> describeTraceByConfiguration(DescribeTraceByConfigurationRequest request);

    CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request);

}
